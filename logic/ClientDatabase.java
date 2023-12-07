package logic;

import java.util.List;

public interface ClientDatabase {
    List<ICliente> getClientsCopy();
    void add(ICliente cliente);
    void remove(ICliente cliente);
    void saveToFile();
    void loadFromFile();
}
