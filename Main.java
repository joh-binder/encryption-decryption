package encryptdecrypt;
import java.util.Scanner;

public class Main {

    public static void encrypt(String input, int shift) {
        for (int i = 0; i < input.length(); i++) {
            int charAsInt = input.charAt(i);
            charAsInt = charAsInt + shift;
            System.out.print((char) charAsInt);
        }
    }

    public static void decrypt(String input, int shift) {
        for (int i = 0; i < input.length(); i++) {
            int charAsInt = input.charAt(i);
            charAsInt = charAsInt - shift;
            System.out.print((char) charAsInt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encOrDec = sc.nextLine();
        String text = sc.nextLine();
        int key = sc.nextInt();

        if (encOrDec.equalsIgnoreCase("enc")) {
            encrypt(text, key);
        } else if (encOrDec.equalsIgnoreCase("dec")) {
            decrypt(text, key);
        }

    }
}
