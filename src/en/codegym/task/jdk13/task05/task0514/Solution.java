package en.codegym.task.jdk13.task05.task0514;

/* 
Initializing objects
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Mike", 25);
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
