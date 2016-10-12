import java.util.StringTokenizer;

class Birthday {
    public static void main(String[] args) {
        String month, day, year,date = "01/26/1993";
        int monthNum;
        StringTokenizer str1;
        
        str1 = new StringTokenizer(date, "/");
        
        month = str1.nextToken();
        day = str1.nextToken();
        year = str1.nextToken();
        
        monthNum = Integer.parseInt(month);
        switch (monthNum) {
            case 1: month = "January";
            break;
            case 2: month = "February";
            break;
            case 3: month = "March";
            break;
            
            default: month = "DEFAULT!";
            break;
        }
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        System.out.println("year: " + year);

    }
}