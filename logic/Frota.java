package logic;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A classe Frota gerencia uma lista de veículos e fornece métodos para adicionar, remover, buscar, salvar e carregar veículos.
 */
public class Frota{
    private final static LinkedList<IVeiculo> veiculos = new LinkedList<>();

    /**
     * Obtém a lista de veículos na frota.
     * @return Um array contendo os veículos.
     */
    public static IVeiculo[] getVeiculos() {
        load();
        return veiculos.toArray(IVeiculo[]::new);
    }

    /**
     * Adiciona um veículo à frota.
     * @param veiculo O veículo a ser adicionado.
     */
    public static void addVeiculo(IVeiculo veiculo) {
        veiculos.add(veiculo);
    }

    /**
     * Remove um veículo da frota.
     * @param veiculo O veículo a ser removido.
     * @param motivo O motivo da remoção.
     */
    public static void removeVeiculo(IVeiculo veiculo, String motivo) {
        veiculos.stream()
                .filter(v -> v.equals(veiculo))
                .findFirst()
                .ifPresent(v -> v.setStatus("indisponivel - " + motivo));
    }

    /**
     * Obtém um veículo com base na placa.
     * @param placa A placa do veículo a ser obtido.
     * @return O veículo com a placa especificada, ou null se não for encontrado.
     */
    public static IVeiculo getVeiculoByPlaca(String placa) {
        load();
        return veiculos.stream()
                .filter(v -> v.getPlaca().equals(placa))
                .findFirst()
                .orElse(null);
    }

    /**
     * Salva os dados dos veículos em um arquivo de texto.
     */
    public static void save(){
        String fileName = "texts/registro_veiculos.txt";
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
            if (!Files.exists(Paths.get(fileName))) {
                Files.createFile(Paths.get(fileName));
                System.out.println("File created: " + fileName);
            }

            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(fileData.toString());
                System.out.println("Salvando arquivo: " + fileName);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carrega os dados dos veículos a partir de um arquivo de texto.
     */
    public static void load(){
        String fileName = "texts/registro_veiculos.txt";

        veiculos.clear();

        try {
            // Read all lines from the file
            Files.lines(Paths.get(fileName)).forEach(line -> {
                if(line.equals(""))
                    return;
                String[] lines = line.split("\t");
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
            });

        } catch (NoSuchFileException ignoredNoSuchFileException) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<IVeiculo> getVeiculosDisponiveis() {
        load();
        return veiculos .stream()
                        .filter(v -> !v.getStatus().startsWith("indisponivel") && !v.getStatus().equals("locado"))
                        .collect(Collectors.toList());
    }
}