package en.codegym.task.jdk13.task05.task0510;

/* 
Initializing cats
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        age = 12;
        weight = 1;
        color = "black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "red";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 100;
        color = "white";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 15;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 40;
    }

    public static void main(String[] args) {

    }
}
