class ExcapeCodes {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 7;
        System.out.println("New line: \n"
                + "Tab: \tTabbed\n"
                + "\r"
                + "\b"
                + "Hi\n"
                + z);
        z = 8;
        y = 9;
        boolean determine = (x == y) || (x == z);
        System.out.println(determine);
        
        String myName = "Rick Zeigler";
        myName += " JR. ";
        System.out.println(myName);
    }
}