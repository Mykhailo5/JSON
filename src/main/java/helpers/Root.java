package helpers;

import java.util.List;

public class Root {
    private String name;
    private List<Animals> animals;

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", animals=" + animals +
                '}';
    }
}
