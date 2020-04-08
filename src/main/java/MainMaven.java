import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MainMaven {

    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);


        System.out.print("\n\tEnter something to modify your input: \n\t>");
        String userString = userInput.nextLine();


        System.out.print("\n\n\tUser Input: ");
        System.out.print("\n\t" + userString);
        System.out.print("\n\n\tModified Inputs:");
        System.out.print("\n\t.isNumeric:  " + StringUtils.isNumeric(userString));
        System.out.print("\n\t.swapCase:  " + StringUtils.swapCase(userString));
        System.out.print("\n\t.reverse:  " + StringUtils.reverse(userString));
        System.out.print("\n\t.deleteWhiteSpace:  " + StringUtils.deleteWhitespace(userString) + "\n");
    }
}
