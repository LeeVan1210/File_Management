/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.file;
import java.io.*;
/**
 *
 * @author Juan
 */
public class FileInfo {
    public static void main(String[]args){
        
        File myObj = new File("C:\\Users\\Public\\Documents\\newFile.txt");
        if (myObj.exists()){
            System.out.println("File Name: "+ myObj.getName());
            System.out.println("Absolute Path: "+ myObj.getAbsolutePath());
            System.out.println("Writable: "+ myObj.canWrite());
            System.out.println("Readable: "+ myObj.canRead());
            System.out.println("File Size in Bytes "+ myObj.length());
        }else{
            System.out.println("The file does not exists.");
        }
    }
    
}
