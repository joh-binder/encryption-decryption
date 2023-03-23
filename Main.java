package encryptdecrypt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int key = sc.nextInt();

        for (int i = 0; i < text.length(); i++) {
            int charAsInt = text.charAt(i);
            if (charAsInt >= 'a' && charAsInt <= 'z') {
                charAsInt = charAsInt - 'a';
                charAsInt = (charAsInt + key) % 26;
                charAsInt = charAsInt + 'a';
                System.out.print((char) charAsInt);
            } else if (charAsInt >= 'A' && charAsInt <= 'Z') {
                charAsInt = charAsInt - 'A';
                charAsInt = (charAsInt + key) % 26;
                charAsInt = charAsInt + 'A';
                System.out.print((char) charAsInt);
            } else {
                System.out.print((char) charAsInt);
            }
        }

    }
}
