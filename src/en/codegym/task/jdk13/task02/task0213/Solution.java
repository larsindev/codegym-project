package en.codegym.task.jdk13.task02.task0213;

/* 
Every animal should have an owner
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman owner = new Woman();

        // So apparently the same woman owns all the animals
        cat.owner = owner;
        dog.owner = owner;
        fish.owner = owner;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
