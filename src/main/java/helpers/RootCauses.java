package helpers;

public class RootCauses {
    public String name;
    public String description;

    public RootCauses(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "RootCauses{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
