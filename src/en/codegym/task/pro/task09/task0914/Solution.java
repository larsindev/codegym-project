package en.codegym.task.pro.task09.task0914;

/* 
Path update
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int index = path.indexOf("jdk", 0);
        int index2 = path.indexOf("/", index);

        String first = path.substring(0, index);
        String last = path.substring(index2);

        return first + jdk + last;
    }
}
