# File_Management
FileIO Project

package com.file;
import java.util.*;
import java.io.*;
import java.nio.file.*;
/**
 *
 * @author Clint
 */
public class FileIO {
    public static String fileName,fileWrite;
    public static int choice;
    public static Scanner in = new Scanner(System.in);
    
    static void createFile() throws IOException{
        
        System.out.print("Enter File Name: ");
        fileName = in.next();
        Path filePath = Paths.get("C:\\Users\\Public\\Documents\\"+fileName+".txt");
        try{
            Path createFile = Files.createFile(filePath);
            System.out.println("File Created "+createFile);

            System.out.print("Write to File? \n [1]Yes [2]No \n::");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Write Content: \n");
                    fileWrite = in.next();
                    String content = fileWrite;
                    byte[] bs = content.getBytes();
                    Path writtenPath = Files.write(filePath, bs);
                    System.out.println("Content Written in file\n"+ new String(Files.readAllBytes(writtenPath))+".txt");
                    break;
                case 2:
                    break;
            }
        }catch(IOException e){
        }
    } // create File in directory and  write content
    
    static void fileEdit(){
        System.out.print("Enter File Name: ");
        fileName = in.next();
        Path filePath = Paths.get("C:\\Users\\Public\\Documents\\"+fileName+".txt");
        try{
            System.out.print("Write Content: \n");
            fileWrite = in.next();
            String content = fileWrite;
            byte[] bs = content.getBytes();
            Path writtenPath = Files.write(filePath, bs);
            System.out.println("Content Written in file\n"+ new String(Files.readAllBytes(writtenPath))+".txt");
            
        }catch(IOException e){
        }
        
    }
    
    static void fileRead(){
//        do{
            System.out.print("Enter File Name: ");
            fileName = in.next();
            Path filePath = Paths.get("C:\\Users\\Public\\Documents\\"+fileName+".txt");
            try{
                byte[] content = Files.readAllBytes(filePath);
                System.out.println("Content: \n"+new String(content));
            }catch(IOException e){
                e.printStackTrace();
                }
//        }while(filePath == true);
    } // read File 
    
    static void fileDir() throws IOException{
         String dirName;
        dirName = "C:\\Users\\Public\\Documents";

        Files.list(new File(dirName).toPath())
//                .limit(10)
                .forEach(System.out::println);
    } // show file Directory
    
    static void fileDel(){
        
    }
    
    static void options() throws IOException{
        do{
            System.out.print("\n[1]Create File [2]Edit File Content [3]File Directory [4]Open File \n::>");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    createFile();
                    break; 
                case 2:
                    //Edit File Content
                    break;
                case 3:
                    fileDir();
                    break;
                case 4:
                    fileRead();
                    break;
                case 5:
                    //rename File
                    break;
            }
        }while(choice !=6);
        System.out.println("Done");
    } // manage file Options
    
    public static void main(String []args) throws IOException{
        
        try {
             options();
         }
         catch(Exception e){
             System.out.println("samting went wong");
         }
        
    }
    
}
