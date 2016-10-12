import java.io.*;

public class Files {
    public static void main(String[] args) {

        /*  Constructing File objects
        File bookName = new File("address.dat");
        or use path name
        File bookName = new File("data]]address.dat");
        also can specify a folder
        File bookName = new File("C:\\MyDocuments\\")
        */
        
        /* Some methods
        exists() - returns true if file exists
        getName() - Retrieves the name of the file, as String.
        length() - The size of the file, as a long value.
        createNewFile() - Creates a file of the same name, if one does not exist
        delete() - Deletes the file, if it exists
        renameTo(File) - Renames the file, using the name of the File object as argument.
        */
        File bookName = new File("C:\\address.dat");
        File test = new File("C:\\testFolder2\\testDocument.txt");
        File cleveland = new File("C:\\testFolder2\\Cleveland.txt");
        File fileCreate = new File("C:\\testFolder2\\createdFile.txt");
        String fileName = bookName.getName();
        long size = bookName.length();
        System.out.println("The size of " + fileName + " is " + size);
        
        try {
        bookName.createNewFile();
        } catch (IOException exc) {
            System.out.println(bookName + " file already exists");
        }

        try {
            File cookie = new File("cookie.web");
            FileInputStream stream = new FileInputStream(cookie);
            System.out.println("Length of file: " + cookie.length());
        } catch (IOException e) {
            System.out.println("Could not read file.");
        }

        checkFile(test);
        checkFile(cleveland);
        readFile(test);
        readFile(cleveland);
        
        try {
            fileCreate.createNewFile();
            String createdFileName = fileCreate.getName();
            String createdFilePath = fileCreate.getPath();
            String pathWOFile;
            int  fileNamePos = createdFilePath.indexOf(createdFileName);
            pathWOFile = createdFilePath.substring(0, fileNamePos);
            System.out.println("The file " + createdFileName 
                    + " should have been created in " + pathWOFile);
        } catch (IOException e) {
            System.out.println("Error - " + e.toString());
        }

    }
    
    static void checkFile(File fileBeingChecked) {
        boolean exists = fileBeingChecked.exists();
        String fileName = fileBeingChecked.getName();
        long fileSize = fileBeingChecked.length();
        
        if (exists == true) {
            System.out.println("The file " + fileName + " does exist and is "
                    + fileSize + " bytes big.");
        } else {
            System.out.println(fileName + " does not exist.");
        }
    }
    
    static void readFile(File fileBeingRead) {
        try {
            String fileName = fileBeingRead.getName();
            FileInputStream fBRStream = new FileInputStream(fileBeingRead);
            byte[] bytes = new byte[128];
            fBRStream.read(bytes);
            String textRead = new String(bytes);
            System.out.println(textRead);
            fBRStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error - " + e.toString());
        } catch (IOException e) {
            System.out.println("Error - " + e.toString());
        }
        
    }

}
