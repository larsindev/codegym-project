package en.codegym.task.jdk13.task05.task0528;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/* 
Display today's date
*/

public class Solution {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }
}
