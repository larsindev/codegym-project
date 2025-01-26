package en.codegym.task.jdk13.task05.task0525;

/* 
The whole duck isn't enough
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat mira = new Cat();
        Cat millo = new Cat();

        Dog sam = new Dog();
        Dog anastasia = new Dog();

        System.out.println(mira);
        System.out.println(millo);
        System.out.println(sam);
        System.out.println(anastasia);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
}
