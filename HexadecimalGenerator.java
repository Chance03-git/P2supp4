import java.util.Random;
public class HexadecimalGenerator {
    /**
     * Generates a string of 32 random hexadecimal characters formatted as:
     * xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
     *
     * @return A formatted string of 32 random hexadecimal characters.
     */
    public static String generateFormattedHexString() {
        Random random = new Random();
        StringBuilder hexBuilder = new StringBuilder();

        // Generate 32 random hexadecimal characters
        for (int i = 0; i < 32; i++) {
            int hexValue = random.nextInt(16); // Random number between 0 and 15
            hexBuilder.append(Integer.toHexString(hexValue)); // Convert to hexadecimal
        }

        // Format the string into xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
        return hexBuilder.substring(0, 8) + "-" +
               hexBuilder.substring(8, 12) + "-" +
               hexBuilder.substring(12, 16) + "-" +
               hexBuilder.substring(16, 20) + "-" +
               hexBuilder.substring(20);
    }
        public static void main(String[] args) {
        // Test the method
        String hexString = generateFormattedHexString();
        System.out.println("Generated Hexadecimal String: " + hexString);
    }
}
