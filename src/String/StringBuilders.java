package String;

public class StringBuilders {
    public static void main(String[] args) {
        // Create an initial StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        // Insert
        sb.insert(5, " Beautiful");
        System.out.println(sb); // Output: Hello Beautiful World

        // Reverse
//        sb.reverse();
        System.out.println(sb.reverse()); // Output: dlroW lufituaeB olleH

        // Convert back to a standard String
        String finalResult = sb.toString();
        System.out.println(finalResult);
    }
}

