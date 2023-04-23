import java.util.Scanner;

public class RouteCipherTest {

    public static void main(String[] args) {
        RouteCipher routeCipher = new RouteCipher(5);

        System.out.println("Encrypted text: " + routeCipher.encrypt("ABORT THE MISSION, YOU HAVE BEEN SPOTTED"));
        System.out.println("Decrypted text: " + routeCipher.decrypt("ATSYVNTEDXXTEANITROBHSOESPOEHOMEIUB"));

        routeCipher.setKey(-5);
        System.out.println("Encrypted text: " + routeCipher.encrypt("ABORT THE MISSION, YOU HAVE BEEN SPOTTED"));
        System.out.println("Decrypted text: " + routeCipher.decrypt("ATSYVNTEDXXTEANITROBHSOESPOEHOMEIUB"));

        routeCipher.setKey(4);
        System.out.println("Encrypted text: " + routeCipher.encrypt("THISISTHEPLAINTEXT"));
        System.out.println("Decrypted text: " + routeCipher.decrypt("TIEIXTXXEAHSIHSPNTLT"));

        routeCipher.setKey(-4);
        System.out.println("Encrypted text: " + routeCipher.encrypt("THISISTHEPLAINTEXT"));
        System.out.println("Decrypted text: " + routeCipher.decrypt("TIEIXTXXEAHSIHSPNTLT"));

    }
}