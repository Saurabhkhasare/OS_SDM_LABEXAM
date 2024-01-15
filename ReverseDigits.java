public class ReverseDigits {

    public static void main(String[] args) {
        // Initialize a number to some integer value
        int originalNumber = 12345;

        System.out.println("Original Number: " + originalNumber);

        // Reverse the digits
        int reversedNumber = reverseDigits(originalNumber);

        System.out.println("Reversed Number: " + reversedNumber);
    }

    // Function to reverse the digits of a number
    private static int reverseDigits(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Move to the next digit
        }

        return reversedNumber;
    }
}
