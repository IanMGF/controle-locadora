package logic;

import java.io.*;

public class Grupo implements IGrupo{
    public static IGrupo grupoBasico;
    public static IGrupo grupoPadrao;
    public static IGrupo grupoPremium;

    private float valorDiaria, valorTanque, valorLimpezaExt, valorLimpezaInt, diariaSeguro;
    private String nome;

    public Grupo(String nome, float valorDiaria, float valorTanque, float valorLimpezaExt, float valorLimpezaInt, float diariaSeguro){
        this.nome = nome;
        this.valorDiaria = valorDiaria;
        this.valorTanque = valorTanque;
        this.valorLimpezaExt = valorLimpezaExt;
        this.valorLimpezaInt = valorLimpezaInt;
        this.diariaSeguro = diariaSeguro;
    }
    //Declaração de arrays utilizados para armazenar valores referentes aos grupos
    private static float[] basico = new float[5];
    private static float[] padrao = new float[5];
    private static float[] premium = new float[5];

    //Declaração de variáveis para alterar arquivo de texto
    private static String basicoString, padraoString, premiumString;
    private static String[] basicoArray = new String[6];
    private static String[] padraoArray = new String[6];
    private static String[] premiumArray = new String[6];
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void load() throws FileNotFoundException, IOException{
        in = new BufferedReader(new FileReader("texts/grupos.txt"));

            basicoString = in.readLine();
            padraoString = in.readLine();
            premiumString = in.readLine();

            basicoArray = basicoString.split("\t");
            padraoArray = padraoString.split("\t");
            premiumArray = premiumString.split("\t");

            for(int i = 0; i < 5; i++){
                basico[i] = Float.parseFloat(basicoArray[i+1]);
                padrao[i] = Float.parseFloat(padraoArray[i+1]);
                premium[i] = Float.parseFloat(premiumArray[i+1]);
            }

            grupoBasico = new Grupo(
                    "basico",
                    basico[0],
                    basico[1],
                    basico[2],
                    basico[3],
                    basico[4]
            );

            grupoPadrao = new Grupo(
                    "padrao",
                    padrao[0],
                    padrao[1],
                    padrao[2],
                    padrao[3],
                    padrao[4]
            );

            grupoPremium = new Grupo(
                    "premium",
                    premium[0],
                    premium[1],
                    premium[2],
                    premium[3],
                    premium[4]
            );
            
            in.close();
    }

    public static void save() throws FileNotFoundException, IOException{
        String txt = new String("basico\t" + basico[0] + "\t" + basico[1] + "\t" + basico[2] + "\t" + basico[3] + "\t" + basico[4] + "\n" + 
                                "padrao\t" + padrao[0] + "\t" + padrao[1] + "\t" + padrao[2] + "\t" + padrao[3] + "\t" + padrao[4] + "\n" + 
                                "premium\t" + premium[0] + "\t" + premium[1] + "\t" + premium[2] + "\t" + premium[3] + "\t" + premium[4] + "\n");

            out = new BufferedWriter(new FileWriter("texts/grupos.txt"));
            out.write(txt);
            out.close();
    }

    public float getValorDiaria(String nome){
        switch (nome) {
            case "basico":
                return basico[0]; 
            
            case "padrao":
                return padrao[0];

            case "premium":
                return premium[0];
        
            default:
                return -1;
        }
    }

    public void setValorDiaria(float valor, String nome){
            switch (nome) {
                case "basico":
                    if(valor>=0){
                        Grupo.basico[0] = valor;
                    }
                    break;

                case "padrao":
                    if(valor>=0){
                        Grupo.padrao[0] = valor;
                    }
                    break;

                case "premium":
                    if(valor>=0){
                        Grupo.premium[0] = valor;
                    }
                    break;
            
                default:
                    break;
            }
        }

    public float getValorTanque(String nome){
        switch (nome) {
            case "basico":
                return basico[1];
            
            case "padrao":
                return padrao[1];

            case "premium":
                return premium[1];
        
            default:
                return -1;
        }
    }

    public void setValorTanque(float valor, String nome){
        switch (nome) {
            case "basico":
                if(valor>=0){
                    Grupo.basico[1] = valor;
                }
                break;

            case "padrao":
                if(valor>=0){
                    Grupo.padrao[1] = valor;
                }
                break;

            case "premium":
                if(valor>=0){
                    Grupo.premium[1] = valor;
                }
                break;
        
            default:
                break;
        }
    }

    public float getValorLimpezaExt(String nome){
        switch (nome) {
            case "basico":
                return basico[2];
            
            case "padrao":
                return padrao[2];

            case "premium":
                return premium[2];
        
            default:
                return -1;
        }
    }

    public void setValorLimpezaExt(float valor, String nome){
        switch (nome) {
            case "basico":
                if(valor>=0){
                    Grupo.basico[2] = valor;
                }
                break;

            case "padrao":
                if(valor>=0){
                    Grupo.padrao[2] = valor;
                }
                break;

            case "premium":
                if(valor>=0){
                    Grupo.premium[2] = valor;
                }
                break;
        
            default:
                break;
        }
    }

    public float getValorLimpezaInt(String nome){
        switch (nome) {
            case "basico":
                return basico[3];
            
            case "padrao":
                return padrao[3];

            case "premium":
                return premium[3];
        
            default:
                return -1;
        }
    }

    public void setValorLimpezaInt(float valor, String nome){
        switch (nome) {
            case "basico":
                if(valor>=0){
                    Grupo.basico[3] = valor;
                }
                break;

            case "padrao":
                if(valor>=0){
                    Grupo.padrao[3] = valor;
                }
                break;

            case "premium":
                if(valor>=0){
                    Grupo.premium[3] = valor;
                }
                break;
        
            default:
                break;
        }
    }

    public float getDiariaSeguro(String nome){
        switch (nome) {
            case "basico":
                return basico[4];
            
            case "padrao":
                return padrao[4];

            case "premium":
                return premium[4];
        
            default:
                return -1;
        }
    }

    public void setDiariaSeguro(float valor, String nome){
        switch (nome) {
            case "basico":
                if(valor>=0){
                    Grupo.basico[4] = valor;
                }
                break;

            case "padrao":
                if(valor>=0){
                    Grupo.padrao[4] = valor;
                }
                break;

            case "premium":
                if(valor>=0){
                    Grupo.premium[4] = valor;
                }
                break;
        
            default:
                break;
        }
    }

    

}