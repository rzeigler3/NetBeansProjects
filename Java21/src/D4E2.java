
public class D4E2 {

    public static void main(String[] args) {
       int[] numbers = new int[10];
       
       for (int i = 0; i < args.length; i++) {
           numbers[i] = loadIntArray(args[i]);
           System.out.println(args[i] + " equals: " + numbers[i]);
       }
    }
    static int loadIntArray(String str) {
        int num = 0;
           switch (str) {
        case "one":
           num = 1;
           break;
        case "two":
           num = 2;
           break;
        case "three":
           num = 3;
           break;
        case "four":
           num = 4;
           break;
        case "five":
           num = 5;
           break;
        case "six":
           num = 6;
           break;
        case "seven":
           num =7;
           break;
        case "eight":
           num = 8;
           break;
        case "nine":
           num = 9;
           break;
        case "ten":
           num = 10;
           break;
        default:
           System.out.println("Switch did not work");
           break;
           }
           
        return num;
    }
}


