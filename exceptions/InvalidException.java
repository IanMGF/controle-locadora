package exceptions;

public class InvalidException extends RuntimeException {

    public InvalidException(){
        this( "Argumento invalido" );
    }

    public InvalidException(String str){
        super(str);
    }
}
