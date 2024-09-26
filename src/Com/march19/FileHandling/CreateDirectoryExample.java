package Com.march19.FileHandling;


import java.io.File;

public class CreateDirectoryExample {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "C:\\example_directory";

        // Create a File object representing the directory
        File directory = new File(directoryPath);

        // Check if the directory already exists
        if (!directory.exists()) {
            // Attempt to create the directory
            boolean directoryCreated = directory.mkdir();
            if (directoryCreated) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }
}









































































