package en.codegym.task.jdk13.task07.task0724;

/*
Family census
*/

public class Solution {
    public static void main(String[] args) {
        Human granddaddy1 = new Human("Michael", true, 84);
        Human grandmommy1 = new Human("Elisa", false, 75);
        Human granddaddy2 = new Human("George", true, 93);
        Human grandmommy2 = new Human("Anna-Marie", false, 95);

        Human father = new Human("Pete", true, 55, granddaddy1, grandmommy1);
        Human mother = new Human("Pete", false, 49, granddaddy2, grandmommy2);

        Human child1 = new Human("Sarah", false, 31, father, mother);
        Human child2 = new Human("Nuriah", false, 28, father, mother);
        Human child3 = new Human("Jack", true, 36, father, mother);

        System.out.println(granddaddy1);
        System.out.println(granddaddy2);
        System.out.println(grandmommy1);
        System.out.println(grandmommy2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }


        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }

            return text;
        }
    }
}