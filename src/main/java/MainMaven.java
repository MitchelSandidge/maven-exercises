import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MainMaven {

//    private String isNumeric() {
//        if ()
//    }

    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);



        System.out.print("\n\tEnter something to modify your input: \n\t>");
        String userString = userInput.nextLine();



        System.out.print("\n\n\tUser Input: ");
        System.out.print("\n\t" + userString);
        System.out.print("\n\n\tModified Inputs:");
        if (StringUtils.isNumeric(userString)) {
            System.out.print("\n\t.isNumeric: The input is a number");
        } else {
            System.out.print("\n\t.isNumeric: The input is not a string");
        }
        System.out.print("\n\t.swapCase:  " + StringUtils.swapCase(userString));
        System.out.print("\n\t.reverse:  " + StringUtils.reverse(userString));
        System.out.print("\n\t.deleteWhiteSpace:  " + StringUtils.deleteWhitespace(userString) + "\n");



    }
}
