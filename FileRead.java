/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.file;
import java.io.*;
import java.util.*;
/**
 *
 * @author Juan
 */
public class FileRead {
    public static void main(String[]atgs){
        try{
            File myObj = new File("C:\\Users\\Public\\Documents\\newFile.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();;
        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
        }
    
}
}
