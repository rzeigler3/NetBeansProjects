public class Calculator {
    public static void main(String[] arguments) {
        float sum = 0;

        for (int i = 0; i < arguments.length; i++) {
            try {
            sum = sum + Float.parseFloat(arguments[i]);     // statements that might cause exception
            } catch (NumberFormatException e) {
                System.out.println(arguments[i] + " is not an number");     // statements that execute when exceptionoccurs
            } catch (ArithmeticException | NullPointerException e) {    // multiple exceptions in one catch
                //
            }
        }
        System.out.println("Those numbers add up to " + sum);
    }
}