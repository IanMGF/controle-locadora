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

public class Frota implements IFrota{
    private LinkedList<IVeiculo> veiculos = new LinkedList<>();

    @Override
    public IVeiculo[] getVeiculos() {
        return veiculos.toArray(IVeiculo[]::new);
    }

    @Override
    public void addVeiculo(IVeiculo veiculo) {
        veiculos.add(veiculo);
    }

    @Override
    public void removeVeiculo(IVeiculo veiculo, String motivo) {
        veiculos.stream()
                .filter(v -> v.equals(veiculo))
                .findFirst()
                .ifPresent(v -> v.setStatus(motivo));
    }

    @Override
    public IVeiculo getVeiculoByPlaca(String placa) {
        return veiculos.stream()
                        .filter(v -> v.getPlaca().equals(placa))
                        .findFirst()
                        .orElse(null);
    }

    public void save(){
        String fileName = "registro_veiculos.txt";
        StringBuilder fileData = new StringBuilder();

        for(IVeiculo veiculo: veiculos){
            fileData.append(veiculo.getPlaca());
            fileData.append('\t');
            fileData.append(veiculo.getMarca());
            fileData.append('\t');
            fileData.append(veiculo.getModelo());
            fileData.append('\t');
            fileData.append(veiculo.getCor());
            fileData.append('\t');
            fileData.append(veiculo.getAno());
            fileData.append('\t');
            fileData.append(veiculo.getGrupo());
            fileData.append('\t');
            fileData.append(veiculo.getStatus());
            fileData.append('\n');
        }

        try {
            if (!Files.exists(Paths.get("registro_clientes.txt"))) {
                Files.createFile(Paths.get(fileName));
                System.out.println("File created: " + fileName);
            }

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(fileData.toString());
                System.out.println("Data written to the file: " + fileName);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(){
        String fileName = "registro_veiculos.txt";

        veiculos.clear();

        try {
            // Read all lines from the file
            Files.lines(Paths.get(fileName)).forEach(line -> {
                if(line.equals(""))
                    return;
                String[] lines = line.split("\t");

                String startDateString = lines[2];
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Date startDate;
                try {
                    startDate = df.parse(startDateString);
                    String newDateString = df.format(startDate);
                    System.out.println(newDateString);
                    Veiculo veiculo = new Veiculo(
                            lines[0],
                            lines[1],
                            lines[2],
                            lines[3],
                            lines[4],
                            lines[5],
                            lines[6]
                    );

                    addVeiculo(veiculo);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
