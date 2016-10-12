class ComparingObjects {
    public static void main(String[] args) {
        Integer x = new Integer(10);
        Integer y = new Integer(10);
        
        boolean same = (x == y); // returns false, they do not refer to same object dispite value
        
        System.out.println("x and y same? " + same);
        
        x = y;
        
        same = (x == y);
        
        System.out.println("x and y same after? " + same);
    }
}