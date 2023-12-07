package logic;

import java.io.*;

public class ParameterUseCases{
    private  BufferedReader in;
    private  BufferedWriter out;

     //Declaração de arrays utilizados para armazenar valores referentes aos grupos
     private float[] basicoData = new float[5];
     private float[] padraoData = new float[5];
     private float[] premiumData = new float[5];
 
     //Declaração de variáveis para alterar arquivo de texto
     private String basicoString, padraoString, premiumString;
     private String[] basicoArray = new String[6];
     private String[] padraoArray = new String[6];
     private String[] premiumArray = new String[6];

    public void load() throws FileNotFoundException, IOException{
        in = new BufferedReader(new FileReader("texts/grupos.txt"));

            basicoString = in.readLine();
            padraoString = in.readLine();
            premiumString = in.readLine();

            basicoArray = basicoString.split("\t");
            padraoArray = padraoString.split("\t");
            premiumArray = premiumString.split("\t");

            for(int i = 0; i < 5; i++){
                basicoData[i] = Float.parseFloat(basicoArray[i+1]);
                padraoData[i] = Float.parseFloat(padraoArray[i+1]);
                premiumData[i] = Float.parseFloat(premiumArray[i+1]);
            }

            IGrupo basico = new Grupo("basico", basicoData[0], basicoData[1], basicoData[2], basicoData[3], basicoData[4]);
            IGrupo padrao = new Grupo("padrao", padraoData[0], padraoData[1], padraoData[2], padraoData[3], padraoData[4]);
            IGrupo premium = new Grupo("premium", premiumData[0], premiumData[1], premiumData[2], premiumData[3], premiumData[4]);

            Grupo.grupoBasico = basico;
            Grupo.grupoPadrao = padrao;
            Grupo.grupoPremium = premium;

            in.close();
    }
}