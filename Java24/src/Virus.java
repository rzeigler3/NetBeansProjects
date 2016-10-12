public class Virus {
    static int virusCount = 0;              // virusVirus is a class variable because its static
    
    public Virus() {                        // constructor
        virusCount++;
    }
    
    static int getVirusCount() {            // class method
        return virusCount;
    }
}