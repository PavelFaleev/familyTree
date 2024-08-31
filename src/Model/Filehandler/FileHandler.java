package Model.Filehandler;

import java.io.*;

public class FileHandler implements Writer {
    private String filePath;

@Override
public boolean write(Serializable serializable) {
    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
        objectOutputStream.writeObject(serializable);
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

@Override
public Object read() {
    try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
        return objectInputStream.readObject();
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

@Override
public void setFilePath(String filePath) {
    this.filePath = filePath;
}



    }
