/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel
 */
public class FileManager {
     public static boolean createFile(String fileModel) {
        boolean created = false;
        try {
            File file = new File(fileModel + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileModel) {
        boolean saved = false;

        createFile(fileModel);

       
   try {   FileWriter myWrite = new FileWriter(fileModel + ".csv", true);
            myWrite.write(System.getProperty("line.separator") + data);
           
            System.out.println("a new record of " + fileModel + " was saved");
            saved = true;

} catch (IOException ex) {
           
            saved = false;
        }

        return saved;
    }
     public static int returnSize(String fileModel){
        int numberOfLines = 0;
        
            try {
                Scanner s = new Scanner(new File(fileModel));
                while(s.hasNextLine()){
                numberOfLines++;
}                    
            } catch (FileNotFoundException ex) {
               System.out.println("file not found");
               
            }
            
            return numberOfLines;
         }
     public static String[] read(String fileModel){
               int counter = 0;
               String data;
       
            
             
                   try {
                       File myObj = new File(fileModel+ ".csv " );
                       Scanner myReader = new Scanner(myObj);
                       while(myReader.hasNextLine()){
                           String data = myReader.hasNextLine();
                           result[counter++] = data
                           
                       }
                       myReader.close();
                   } catch (FileNotFoundException ex) {
                      System.out.println("An error ocurred.");
                      e.printStackTrace();
                      
                   }
            
            
           

