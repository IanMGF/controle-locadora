package exceptions;

public class AlreadyAddedExeception extends RuntimeException {

    public AlreadyAddedExeception(){
        this("Elemento ja adicionado");
    }

    public AlreadyAddedExeception(String str){
        super(str);
    }
}