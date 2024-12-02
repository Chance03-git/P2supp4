import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringHasher {
    public static void main(String[] args) {
        // Test the hashString method
        String input = "Hello, World!";
        String hashedOutput = hashString(input);
        System.out.println("Input String: " + input);
        System.out.println("Hashed String: " + hashedOutput);
    }
}