package tut09;

import java.io.File;//input a file
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Act01 {
    // creat a file outside the package but inside the project
    // Use Scanner to read a file
    // After input or output we have to close a file to update all our settings
    public static void main(String[] args) {
        File myfile = new File ("menuFood.txt");/// declare and assign the file name
//        int i=0;
        try { // use try catch throw to use file
            // use printwriter to input data into file under text

            PrintWriter writer = new PrintWriter("menuFood.txt");
            writer.println(". Hamburger");
            writer.println(". BeefStake");
            writer.println(6906);
            writer.println(". Hotdog");
            writer.flush();
            writer.close(); // remove the control of file

//            Scanner sc = new Scanner (myfile);//**  pass file as a parameter to access
//            // Use scanner to read data from a file (text)
//            // Read the lines (type String) in 'myfile' file.
//            // Use loop and method hasNextLine() to read the multiple-line files
//
//            while(sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//      myfile.delete();
    }
}
