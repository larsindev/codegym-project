package en.codegym.task.jdk13.task05.task0509;

/* 
Populate the Friend class
*/

public class Friend {
    private String name;
    private int age;
    private char sex;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
