package logic;

import java.util.List;

public interface IClientDatabase {
    List<ICliente> getClientsCopy();
    void add(ICliente cliente);
    void remove(ICliente cliente);
    void saveToFile();
    void loadFromFile();
}
