package factoryMethod.clothing;

import java.util.Scanner;

public class InputHelper {
    public static String getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
