package logic;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ReservaDatabase {
    private static List<IReserva> reservas;

    /**
     * @return Uma cópia da lista de reservas
     */
    public static List<IReserva> getReservasCopy() {
        loadFromFile();
        return new LinkedList<>(reservas);
    }

    /**
     * @param reserva O objeto referente ao cliente a ser adicionado
     */
    public static void add(IReserva reserva) {
        reservas.add(reserva);
        saveToFile();
    }

    /**
     * @param reserva O objeto referente ao cliente a ser removido
     */
    public static void remove(IReserva reserva) {
        reservas.remove(reserva);
        saveToFile();
    }

    /**
     * Salva a base de dados em um arquivo
     */
    public static void saveToFile() {
        String fileName = "registro_clientes.txt";
        StringBuilder fileData = new StringBuilder();
        String pattern = "yyyy-MM-dd";
        DateFormat df = new SimpleDateFormat(pattern);

        for(IReserva reserva: reservas){
            fileData.append(reserva.getCodigo());
            fileData.append('\t');
            fileData.append(reserva.getCliente().getCPF());
            fileData.append('\t');
            fileData.append(reserva.getVeiculo().getPlaca());
            fileData.append('\t');
            fileData.append(df.format(reserva.getDataRetirada()));
            fileData.append('\t');
            fileData.append(df.format(reserva.getDataDevolucao()));
            fileData.append('\n');
            fileData.append(reserva.getValor());
            fileData.append('\n');
            fileData.append(reserva.getStatus());
            fileData.append('\n');
        }

        try {
            if (!Files.exists(Paths.get("registro_reservas.txt"))) {
                Files.createFile(Paths.get(fileName));
                System.out.println("Arquivo criado " + fileName);
            }

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(fileData.toString());
                System.out.println("Salvando arquivo " + fileName);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carrega a base de dados de um arquivo
     */
    public static void loadFromFile() {
        String fileName = "registro_clientes.txt";

        reservas.clear();

        try {
            // Read all lines from the file
            Files.lines(Paths.get(fileName)).forEach(line -> {
                if (line.equals(""))
                    return;
                String[] lines = line.split("\t");

                String startDateString = lines[2];
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Date startDate;
                try {
                    startDate = df.parse(startDateString);

                    String id = lines[0];
                    String cpf = lines[1];
                    String placa = lines[2];
                    String dataRetiradaStr = lines[3];
                    String dataDevolucaoStr = lines[4];
                    String valorLocacao = lines[5];
                    String status = lines[6];

                    IVeiculo veiculo = Frota.getVeiculoByPlaca(placa);

                    Date dataRetirada = df.parse(dataRetiradaStr);
                    Date dataDevolucao = df.parse(dataDevolucaoStr);

                    float total = Float.parseFloat(valorLocacao);

                    Reserva reserva = new Reserva(
                            veiculo,
                            dataRetirada,
                            dataDevolucao,
                            total,
                            id,
                            cpf,
                            status
                    );
                    add(reserva);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
