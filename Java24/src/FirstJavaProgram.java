public class FirstJavaProgram {     // This class must match in the side pane
    public static void main(String[] args) {    // This declares as the main function/method of the project
        double a = 7;                // int (integer) only takes whole numbers i.g. (1, 5, 17, 100056). NO DECIMALS i.g. (1.1, 5.6)
        double b = 7.5;              // double will take decimals and whole numbers
        double c = 10;
        double sum = 0;
        double numbers[] = {1,2,3,4,5};
        String string = "";     // String is capitalized because its an object
        
        if (c > a) {
            sum = c + b;
        } else {
            sum = a + b;
        }
        
        System.out.print("The numbers in the numbers array are: ");
        
        for (int i = 0; i < numbers.length; i++) {
            double num;
            
            num = numbers[i];
            
            System.out.print(num);

        }
        
        
        
    }
}