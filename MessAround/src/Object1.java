class Object1 {
    static int count = 0;
    
    public Object1() {
        Object2 obj2 = new Object2();
    }
    
    public int getCount() {
        return count;
    }
    public static void main(String[] args) {
        Object1 start = new Object1();
    }
}