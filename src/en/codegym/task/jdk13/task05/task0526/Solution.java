package en.codegym.task.jdk13.task05.task0526;

/* 
Man and woman
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Joshua", 25, "New York Broadway");
        Woman woman = new Woman("Laurel", 21, "New York Plaza");

        Man man2 = new Man("Joshua", 25, "New York Broadway");
        Woman woman2 = new Woman("Laurel", 21, "New York Plaza");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
