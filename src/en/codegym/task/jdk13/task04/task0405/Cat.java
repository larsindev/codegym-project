package en.codegym.task.jdk13.task04.task0405;

/* 
Setting the number of cats
*/

public class Cat {
    private static int catCount = 0;

    public static void setCatCount(int addCats) {
       catCount = addCats;
    }

    public static void main(String[] args) {
        setCatCount(3);
        System.out.println(catCount);
    }
}
