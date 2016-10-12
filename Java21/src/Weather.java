
public class Weather {
    public static void main(String[] args) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        // To convert Fahrenheit into Celsius
        //begin by subtracting 32
        fah = fah - 32;
        // Divide the answer by 9
        fah = fah / 9;
        // Multiply the answer by 5
        fah = fah * 5;
        System.out.println(fah + " degrees Celsius");
        
        float cel = 33;
        System.out.println(cel + " degrees Celsius is ...");
        // To convert Celsius into Fahrenheit
        cel = cel * 9;
        // Divide thee anser by 5
        cel = cel / 5;
        // add 32 to the answer
        cel = cel + 32;
        System.out.println(cel + " degrees Fahrenheit");
    }
}
