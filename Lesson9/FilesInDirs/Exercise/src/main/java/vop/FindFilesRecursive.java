package vop;

import java.io.File;
import java.util.Scanner;

/**
 * @author erso
 */
public class FindFilesRecursive {

    private int noDirs;
    private int noFiles;


    // Exercise: If a file is a directory: Call all files recursively,
    // else print full path to the file. Count both dirs and atomic files.


private void findFiles (File file) {
    if (file.isDirectory()) {

        File [] files = file.listFiles();
        noDirs++;

        for (int i = 0; i < files.length; i++) {
            findFiles(files[i]);
//            System.out.println("The path for " + file + " is " + file.getAbsolutePath());

            if (files[i] != null) {
                noFiles++;
            }
        }
    } else if (file.isFile()) {
        noFiles++;
//        System.out.println("The path for " + file + " is " + file.getAbsolutePath());
    }
}




    @Override
    public String toString() {
        return "FindFilesRecursive {" + "noDirs = " + noDirs + ", noFiles = " + noFiles + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompt the user to enter a directory or a file
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        File startDir = new File(directory);

        FindFilesRecursive ffr = new FindFilesRecursive();
        ffr.findFiles(startDir);
        System.out.println("\n*************\n" + ffr);
    }
}
