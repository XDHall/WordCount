
/**
 * Assignment 4
 *
 * @author Xavier Hall
 * @version 5/5/18
 */
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;

public class FileWordCounter extends Word
{
    public static void main (String[]args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        Map<String, Integer> myMap = new HashMap<String, Integer>();

        while (inputFile.hasNext()) {
            String word = inputFile.next();
            if (!myMap.containsKey(word)) {
                myMap.put(word,1);
            }
            else {
                myMap.put(word,myMap.get(word)+1);
                
            }
        }
        System.out.println(myMap);
    }
    //File Paths: 
    //E:\BlueJ\Assignment4\properkjv_1.txt
    //E:\BlueJ\Assignment4\properkjv_2.txt
    //E:\BlueJ\Assignment4\properkjv_3.txt
}

