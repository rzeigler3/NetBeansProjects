class HalfDollars {
    public static void main(String[] args) {
        int[] denver = { 1_900_000, 1_700_000, 1_700_000 };
        int[] philidelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int average;
        
        philidelphia[0] = 1_900_000;
        philidelphia[1] = 1_800_000;
        philidelphia[2] = 1_750_000;
        
        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[i] + philidelphia[i];
        }
        average = (total[0] + total[1] + total[2]) / 3;
        
        /*
        System.out.print("2009 production: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("2010 production: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("2011 production: ");
        System.out.format("%,d%n", total[2]);
        */
        
        showTotal(total);
        showAverage(average);
    }
    static void showTotal(int[] x) {
       int year = 2009;
       for (int i = 0; i < x.length; i++, year++) {
       System.out.print(year + " production: ");
       System.out.format("%,d%n", x[i]);
       }
    }
    static void showAverage(int x) {
        System.out.print("Average Production: ");
        System.out.format("%,d%n", x);
    }
}