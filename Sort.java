//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Mar 27, 2022
// Homework 7 - Programming Exercise 4.15 (page 285) Sort String
//////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.util.Arrays;
public class Sort {
    public static String sort(String s) {
        char str[] = s.toCharArray();
        Arrays.sort(str);
        String out = new String(str);
        System.out.println(out);
        return out;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String sort = input.nextLine();
        sort(sort);
    }
        
}
