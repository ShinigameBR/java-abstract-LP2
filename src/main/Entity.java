package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class Entity implements Serializable {
    public abstract String fileName();

    private boolean saveFile() {
        try (FileOutputStream f = new FileOutputStream(new File(fileName() + ".txt"))) {
            try (ObjectOutputStream o = new ObjectOutputStream(f)) {
                o.writeObject(this);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    };

    public abstract boolean validar();

    public boolean salvar() {
        if (!validar()) {
            return saveFile();
        }
        return false;
    };
}
