/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.file;
import java.nio.file.*;
import java.util.List;
/**
 *
 * @author Juan
 */
public class createFileNio {
    public static void main(String[]args){
        Path path = Paths.get("C:\\Users\\Public\\Documents\\newFile.txt");
		try {
			byte[] bs = Files.readAllBytes(path);
			List<String> strings = Files.readAllLines(path);
			
			System.out.println("Read bytes: \n"+new String(bs));
			System.out.println("Read lines: \n"+strings);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
}
