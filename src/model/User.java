package model;

public class User {
    private String name;
    private String numHouse;
    private String code;

    public User() {
    }

    public User(String name, String numHouse, String code) {
        this.name = name;
        this.numHouse = numHouse;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(String numHouse) {
        this.numHouse = numHouse;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", numHouse='" + numHouse + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
