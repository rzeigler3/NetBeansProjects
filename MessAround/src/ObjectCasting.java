class ObjectCasting {
    public static void main(String[] args) {
        Number xNum = 15;
        Integer yInt = new Integer(5);
        int y;
        boolean yEqualsYInt;
        
        y = yInt.intValue();
        yInt = (Integer)xNum; // Need to cast xNum(of number class) missing variables from Integer subclass
        yEqualsYInt = yInt.equals(y);
        
        System.out.println("yInt is: " + yInt + "\n"
            + "y: " + y + "\n"
            + "Are y and yInt equal: " + yEqualsYInt);
    }
}