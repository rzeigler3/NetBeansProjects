class VolcanoApplication {
    public static void main(String[] args) {
        VolcanoRobot dante = new VolcanoRobot();
        dante.name = "dante";
        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;
        
        dante.showAttributes();
        System.out.println("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changin temperature to 670");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
        
        VolcanoRobot jim = new VolcanoRobot();
        jim.name = "jim";
        jim.status = "exhausted";
        jim.speed = 1;
        jim.temperature = 350;
        jim.showAttributes();
        
    }
}