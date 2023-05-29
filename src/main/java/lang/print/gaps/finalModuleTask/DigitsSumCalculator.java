package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        number = Math.abs(number); // Ensure number is positive
        
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;  // Add the digit to the sum
            number /= 10;  // Remove the last digit from the number
        }
        System.out.println(sum);
    }
}
