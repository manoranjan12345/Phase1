package com.phaseone;


import java.io.File;
import java.io.IOException;
public class FileOps {
	
	public void saveFile(String path, String text) {
		
		System.out.println("Hi you are in searching file.");
		try {
		      File myObj = new File(path);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } 
		      else {
		        System.out.println("File already exists.");
		      }
		    } 
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	public void deleteFile(String path) {
		
		System.out.println("Hi you are in delete file.");
        File myObj = new File(path);
        if (myObj.delete()) {
          System.out.println("File deleted: " + myObj.getName());
        } 
        else {
          System.out.println("File deletion failed.");
        }
		    
	}
}

