import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        System.out.print("Enter something: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            Integer.parseInt(input);
            System.out.println(input + "is a number.");
        } catch (NumberFormatException e) {
            System.out.println(input+ " is not a number.");
        }
        System.out.println("Flipped case = "+ StringUtils.swapCase(input));
        System.out.println("Reversed = " + StringUtils.reverse(input));
    }
}
