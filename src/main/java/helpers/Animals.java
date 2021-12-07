package helpers;

public class Animals {
    private String name;
    private String speaking;
    private int age;
    private String colour;

    public Animals(String name, String speaking, int age, String colour) {
        this.name = name;
        this.speaking=speaking;
        this.age=age;
        this.colour=colour;
    }

    public String getName() {
        return name;
    }

    public String getSpeaking() {
        return speaking;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", speaking='" + speaking + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
