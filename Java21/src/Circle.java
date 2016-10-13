class Circle {
    int x, y, radius;
    String name;
    
    Circle(String name, int xPoint, int yPoint, int radiusLength) {
        this.name = name;
        x = xPoint;
        y = yPoint;
        radius = radiusLength;
    }
    Circle(int xPoint, int yPoint, int radiusLength) {
        x = xPoint;
        y = yPoint;
        radius = radiusLength;
    }
    
    Circle(int yPoint) {
        this(5, yPoint, 1);
    }
    
    Circle(int xPoint, int yPoint) {
        this("Default", xPoint, yPoint, 1);
    }
    
    void getCircleInfo() {
        System.out.println("Name: " + name);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Radius: " + radius);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Circle circleA = new Circle(5, 10);
        Circle circleB = new Circle(8, 8, 10);
        Circle circleC = new Circle("C", 13, 13, 5);
        circleA.getCircleInfo();
        circleB.getCircleInfo();
        circleC.getCircleInfo();
    }
}