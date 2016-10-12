public class ThrowingExceptions {
    public static void main(String[] args) {
        Float principal;
        String loanText = "5";
        for (int i = 0; i < args.length; i++) {
            try {
                principal = Float.parseFloat(loanText) * 1.1F;
            } catch (NumberFormatException e) {
                System.out.println(args[i] + " is not a number.");
                /* or
                System.outprintln("Error " + e.getMessage());
                */
                throw e;
            }
        }    
    }
}