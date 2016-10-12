import java.io.*;

public class WritingAndReadingFiles {
    public static void writeToFile(File fileBeingWroteTo, byte[] x) {
        try {
            FileOutputStream out = new FileOutputStream(fileBeingWroteTo);
            out.write(x);
        } catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File createdFile = new File("C:\\testFolder2\\writeFile.txt");
        String test = "This is a test String";
        byte[] bytes = test.getBytes();
        writeToFile(createdFile, bytes);
    }
}
