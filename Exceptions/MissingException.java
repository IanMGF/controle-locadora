package Exceptions;

public class MissingException extends RuntimeException {
    
    public MissingException(){
        this( "Existem campos sem informacao" );
    }

    public MissingException(String str){
        super(str);
    }
}
