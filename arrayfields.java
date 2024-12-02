public class arrayfields {
    public static void main(String[] args) {
        // Test the StringArrayHandler class
        StringArrayHandler handler = new StringArrayHandler(5);

        // Insert strings into the array
        handler.insert("Hello", 0);
        handler.insert("World", 1);
        handler.insert("Overflow", 7); // This will wrap around to index 2
        handler.insert("Java", 4);
        handler.insert("Example", 5); // This will wrap around to index 0

        // Display the array contents
        System.out.println("Array Contents: " + handler.getArrayContents());
    }
}

