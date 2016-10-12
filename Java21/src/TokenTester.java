import java.util.StringTokenizer;

class TokenTester {
    public static void main(String[] args) {
        StringTokenizer st1, st2;
        
        String quote1 = "GOOG 604.43 0.42";
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());
        
        String quote2 = "RHT@60.39@0.78";
        st2 = new StringTokenizer(quote2, "@");
        System.out.println("\nToken 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());
    }
    
}


class TokenTester2 {
    public static void main(String[] args) {
        String name, major;
        float gpa;
        
        String quote1 = "Rick Zeigler;3.83;Programming";
        StringTokenizer string1 = new StringTokenizer(quote1, ";");
        
        name = string1.nextToken();
        gpa = Float.parseFloat(string1.nextToken());
        major = string1.nextToken();
        
        displayInfo(name, gpa, major);
    }
    
       static void displayInfo(String x, float y, String z) {
            System.out.println("\nName: " + x);
            System.out.println("GPA: " + y);
            System.out.println("Major: " + z);
    }
}

