/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
/**
 *
 * @author Juan
 */
public class fileDir {
    public static void main(String[] args) throws IOException {

        String dirName;
        dirName = "C:\\Users\\Public\\Documents";

        Files.list(new File(dirName).toPath())
//                .limit(10)
                .forEach(path -> {
                    System.out.println(path);
                });
    }
}
    
    

