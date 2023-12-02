package Exceptions;

public class CurrentlyRentedException extends RuntimeException{
    
    public CurrentlyRentedException(){
        this("Veiculo esta locado no momento");
    }

    public CurrentlyRentedException(String str){
        super("Veiculo esta locado no momento" + str);
    }
}
