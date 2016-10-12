import java.util.Random;

class ArrayInArray {
    public static void main(String[] args) {
        int[][] dayValue = new int[52][7];
        System.out.println("First array: " + dayValue.length);
        System.out.println("Second array: " + dayValue[0].length);
        int totalDays = dayValue.length * dayValue[0].length;
        
        System.out.println(totalDays);
        
        for (int i = 0, x = 0, y = 0; i < totalDays; i++, x++) {
            Random rand = new Random();
            if (x > 6) {
                x = 0;
                y++;
            }
            dayValue[y][x] = rand.nextInt(100) + 1;
        }

        for (int i = 0, x = 0, y = 0; i < totalDays; i++, x++) {
            if ( x > 6 ) {
                x = 0;
                y++;
            }
            System.out.println("Day " + (i+1) + " value: " + dayValue[y][x]);
        }
    }
}