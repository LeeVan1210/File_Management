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
public class FileWrite {
    public static void main(String[]args){
        String in;
        Scanner input = new Scanner(System.in);
        try{
            try (FileWriter myWriter = new FileWriter("C:\\Users\\Public\\Documents\\newFile.txt")) {
//                System.out.print("Enter Text to Write: ");
//                in = input.next();
                myWriter.write("im from write file ");
            }
            System.out.println("Write Successfull");
        }catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
    
}
