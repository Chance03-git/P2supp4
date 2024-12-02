import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringHasher {
    public static String hashString(String input) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Perform the hashing
            byte[] hashBytes = digest.digest(input.getBytes());

            // Convert the hash bytes to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b); // Mask with 0xff to handle negative values
                if (hex.length() == 1) {
                    hexString.append('0'); // Add leading zero for single-digit hex values
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle case where SHA-256 is not available
            throw new RuntimeException("SHA-256 algorithm not found.", e);
        }
    }
    public static void main(String[] args) {
        // Test the hashString method
        String input = "Hello, World!";
        String hashedOutput = hashString(input);
        System.out.println("Input String: " + input);
        System.out.println("Hashed String: " + hashedOutput);
    }
}