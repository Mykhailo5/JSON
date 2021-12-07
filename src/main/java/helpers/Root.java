package helpers;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Root {
    private String name;

    @SerializedName("animals_list")
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
