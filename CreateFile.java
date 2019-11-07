///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.file;
//
///**
// *
// * @author Juan
// */
//import java.io.*;
//import java.util.*;
//
//public class CreateFile {
//    public static void main(String []args){
//        String fileName;
//        
//      try{
//          System.out.println("Enter File Name: ");
//          Scanner in = new Scanner(System.in);
//          fileName = in.next();
//        File myObj = new File("C:\\Users\\Public\\Documents\\"+fileName+".txt");
//        if(myObj.createNewFile()){
//            System.out.println("File Created: " + myObj.getName());
//        }else{
//            System.out.println("File Already Exists.");
//        }
//      }catch(IOException e){
//          System.out.println("An Error Occured.");
//      }
//    }   
//}

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Java Files write file example
 * 
 * @author pankaj
 *
 */
public class CreateFile {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Public\\Documents\\file.txt");
		try {
			String str = "This is write file Example";
			byte[] bs = str.getBytes();
			Path writtenFilePath = Files.write(path, bs);
			System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}