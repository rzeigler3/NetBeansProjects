public class VirusLab {
    public static void main(String[] args) {
        int numViruses = Integer.parseInt(args[0]);
        if (numViruses > 0) {
            Virus[] virii = new Virus[numViruses];          // Creates an array of Virus objects named virii wiht numViruses big.
                                       
            System.out.println("There are " + Virus.getVirusCount()
                + " viruses.\n");
        }
    }
}