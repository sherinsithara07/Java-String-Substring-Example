public class StringExample {
    public static void main(String[] args) {
        String username = "JohnDoe123";
        
        // Extract the first 3 characters
        String firstThree = username.substring(0, 3);
        System.out.println(firstThree);  // Output: Joh
        
        // Extract the first 5 characters
        String firstFive = username.substring(0, 5);
        System.out.println(firstFive);  // Output: JohnD
        
        // If the string is shorter than requested, it will return up to the available length
        String shortName = "Hi";
        String firstThreeShort = shortName.substring(0, Math.min(3, shortName.length()));
        System.out.println(firstThreeShort);  // Output: Hi
    }
}
