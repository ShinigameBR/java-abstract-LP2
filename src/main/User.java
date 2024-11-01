package main;

public class User extends Entity {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String fileName() {
        return name;
    }

    @Override
    public boolean validar() {
        if (fileName().length() >= 5) {
            return true;
        }
        return false;
    }
}
