class EqualsTester {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Free the bound periodicals.";
        str2 = str1;
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("str1 equals str2? " + (str1 == str2) + "\n");
        
        str2 = "Is str1 and str2 different now?";
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("str1 equals str2 after str2 change? " + (str1 == str2 + "\n"));
        
        System.out.println("Integer Objects");
        
        Integer x = new Integer(5);
        Integer y = new Integer(10);
        x = y;
        
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x and y same object? " + (x == y));
    }
}