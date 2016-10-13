class VolcanoRobot2 {
    String robotName;
    String status;
    int speed;
    int power;
    
    VolcanoRobot2(String in1, String in2, int in3, int in4) {
        robotName = in1;
        status = in2;
        speed = in3;
        power = in4;
    }
    
    void getRobotStatus() {
        System.out.println("Robot' Name: " + robotName);
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Power: " + power);
        System.out.println();
    }
    
    public static void main(String[] args) {
        VolcanoRobot2 Jimmy = new VolcanoRobot2("Jimmy", "Default", 0, 100);
        VolcanoRobot2 Scotty = new VolcanoRobot2("Scotty", "Decomissioned", 0, 0);
        VolcanoRobot2 Alexander = new VolcanoRobot2("Alexander", "Exploring", 15, 60);
        Jimmy.getRobotStatus();
        Scotty.getRobotStatus();
        Alexander.getRobotStatus();
    }
}