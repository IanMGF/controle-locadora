package Exceptions;

public class CurrentlyRentedException extends RuntimeException{
    
    public CurrentlyRentedException(){
        this("logic.Veiculo esta locado no momento");
    }

    public CurrentlyRentedException(String str){
        super("logic.Veiculo esta locado no momento" + str);
    }
}
