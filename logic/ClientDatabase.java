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

public class ClientDatabase implements IClientDatabase{
    private List<ICliente> clientList = new LinkedList<>();

    @Override
    public List<ICliente> getClientsCopy() {
        return new LinkedList<>(clientList);
    }

    @Override
    public void add(ICliente cliente) {
        clientList.add(cliente);
    }

    @Override
    public void remove(ICliente cliente) {
        clientList.remove(cliente);
    }

    @Override
    public void saveToFile() {
        String fileName = "registro_clientes.txt";
        StringBuilder fileData = new StringBuilder();

        for(ICliente cliente: clientList){
            fileData.append(cliente.getCPF());
            fileData.append('\t');
            fileData.append(cliente.getNomeCompleto());
            fileData.append('\t');
            fileData.append(cliente.getNascimento());
            fileData.append('\t');
            fileData.append(cliente.getEmail());
            fileData.append('\t');
            fileData.append(cliente.getCelular());
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

    @Override
    public void loadFromFile() {
        String fileName = "registro_clientes.txt";

        clientList.clear();

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
                    Cliente cliente = new Cliente(
                            lines[1],
                            lines[0],
                            startDate,
                            lines[3],
                            lines[4],
                            ""
                    );
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
