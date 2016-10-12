public class VarToObj {
    public static void main(String[] args) {
        Integer suffix = new Integer(53090);
        int newSuffix = suffix.intValue();
        
        System.out.println(newSuffix);
        
        String count = "25";
        int myCount = Integer.parseInt(count);
        
        System.out.println(myCount);
    }
}