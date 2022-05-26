import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String:");
        String text = sc.nextLine();
        System.out.println("Value in which each character in the plaintext string gets shifted:");
        int offset = sc.nextInt();
        System.out.println("Encrypted String:"+ Encoding_Class.encrypting( text, offset ));
        System.out.println("Decrypted String:"+ Decoding_Class.decrypting(Encoding_Class.encrypting(text,offset),offset));
    }
}
