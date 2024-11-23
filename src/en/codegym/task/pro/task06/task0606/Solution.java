package en.codegym.task.pro.task06.task0606;

/* 
A method for all seasons
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void universalMethod() {

    }

    public static void universalMethod(int param) {
        System.out.println("One integer parameter: " + param);
    }

    public static void universalMethod(String param1, String param2) {
        System.out.println("Two string parameters: " + param1 + ", " + param2);
    }

    public static void universalMethod(boolean flag) {
        System.out.println("Boolean parameter: " + flag);
    }

    public static void universalMethod(double param1, int param2) {
        System.out.println("Double and integer parameters: " + param1 + ", " + param2);
    }

    public static void universalMethod(java.util.List<String> items) {
        System.out.println("List of strings: " + items);
    }

    public static void universalMethod(Integer param) {
        System.out.println("Nullable integer parameter: " + param);
    }

    public static void universalMethod(String... params) {
        System.out.println("Vararg parameters: " + String.join(", ", params));
    }

    public static void universalMethod(Runnable action) {
        System.out.println("Lambda parameter invoked");
        action.run();
    }

    public static void universalMethod(Object param) {
        System.out.println("Generic object parameter: " + param);
    }
}
