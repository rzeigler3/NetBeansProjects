import java.awt.*;

public class PointTester {
    public static void main(String[] args) {
        Point object1 = new Point(11, 12);
        Point3D object2 = new Point3D(7, 6, 64);
        
        System.out.println("The 2D point is located at (" + object1.x
                + ", " + object1.y + ")");
        System.out.println("The 3D point is located at (" + object2.x
                + ", " + object2.y + ", " + object2.z + ")");
        
        object1.move(20, 30);
        object2.move(50, 65, 100);
        
        System.out.println("The 2D point is now located at ("
                + object1.x + ", " + object1.y + ")");
        System.out.println("The 3D point is now located at ("
                + object2.x + ", " + object2.y + ", " + object2.z);
        
        object1.translate(-10, -15);
        object2.translate(-10, -15, -30);
        
        System.out.println("The 2D point has translated to ("
                + object1.x + ", " + object1.y + ")");
        System.out.println("The 3D point has translated to ("
                + object2.x + ", " + object2.y + ", " + object2.z + ")");
        
    }
}