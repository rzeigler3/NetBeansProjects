class Casting {
    public static void main(String[] args) {
        int dec;
        int i;
        char literal;
        
        for (dec = 0, i = 0; dec < 127; dec++, i++) {
            literal = (char) dec;
            System.out.print(dec + ": " + literal + "\t");
            if (i == 2) {
                System.out.println();
                i = -1; // set to -1 because it will increment back to 0 after if
            }
        }    
    }
}