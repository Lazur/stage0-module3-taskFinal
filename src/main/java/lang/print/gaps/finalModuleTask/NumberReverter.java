package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int digit1 = number / 100;    // Extract the hundreds digit
        int digit2 = (number / 10) % 10;    // Extract the tens digit
        int digit3 = number % 10;    // Extract the units digit

        System.out.println(digit3 * 100 + digit2 * 10 + digit1);
    }
}
