import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        System.err.println("N = " + N);
        System.err.println("N = " + Q);
        
        HashMap<String, String> mimeMap = new HashMap<String, String>();

        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            mimeMap.put(EXT, MT);
            System.err.println("Mime map: " + mimeMap.get(EXT));
        }
        in.nextLine();
        String [] extension;
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            extension = FNAME.split("\\.");
            System.err.print(extension[0]);
            System.err.print(".");
            System.err.println(extension[1]);


            if (mimeMap.containsKey(extension[1]))
                System.out.println(mimeMap.get(extension[1]));
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
    }
}