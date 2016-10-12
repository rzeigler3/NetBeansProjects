
class VolcanoRobot {
    String name;
    String status;
    int speed;
    float temperature;
    
    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home";
            speed = 5;
        }
    }
    
    void showAttributes() {
        System.out.println(name + "'s attributes");
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
  /* constructer with String 
    VolcanoRobot(String x) {
        name = x;
        status = "default";
        speed = 0;
        temperature = 0;
    }
*/
}