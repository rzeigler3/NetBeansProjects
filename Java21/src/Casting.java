class Casting {
    public static void main(String[] args) {
        short x = 5, y = 7, z = 15;
        int result;
        result = (int)(z / x);
        
        System.out.println(x + " " + y + " " + z);
        System.out.println("Result: " + result);
    }
}