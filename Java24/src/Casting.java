public class Casting {
    public static void main(String[] args) {
        double source = 5.99;
        double source2 = 10.25;
        char letter = 'A';
        int asciiNum;
        
        asciiNum = letter;
        
        int destination = (int) (source2 / source);
        
        System.out.println("source = " + source + "\n"
            + "destination = " + destination);
    }
}