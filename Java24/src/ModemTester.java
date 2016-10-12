public class ModemTester {
    public static void main(String[] args) { //THIS IS WHERE THE PROGRAM IS RAN!!!!!
        CableModem surfBoard = new CableModem();    //Creates a new object under the class CableModem
        DslModem gateway = new DslModem();          // Same, but for DslModem
        AcousticModem guitar = new AcousticModem();
        surfBoard.speed = 500000;                   // speed is found in the Modem
        gateway.speed = 400000;                     // speed is found in the Modem
        guitar.speed = 300;
        System.out.println("Trying the cable modem:");
        surfBoard.displaySpeed();                   // displaySpeed found in Modem
        surfBoard.connect();                        // found in CableModem
        System.out.println("Trying the DSL modem:");
        gateway.displaySpeed();                     // found in Modem
        gateway.connect();                          // found in DslModem
        System.out.println("Trying the Acoustic modem:");
        guitar.displaySpeed();
        guitar.connect();
    }
}