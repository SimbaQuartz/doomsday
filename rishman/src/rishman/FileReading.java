
/*
 * This code is written by Manjot Singh, and under plagarism
 * of this code in any circumstances will be subject to the
 * copyright issues.
 * 
 * 
 * 
 * Manjot Singh- (Project Developer)
 * */

package rishman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReading {
	FileReading(){
		System.out.println("Reading the file");
	}

	String startReading(){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Which file do you want to upload?\n Enter the path\n\n"
	    		+ "If you file is in c: -> abc -> xyz-> iAmAFile.txt, then enter C:\\abc\\xyz\\iAmAFile.txt :-");
	
		String path=sc.nextLine();
		System.out.println("Your entered path is :-"+path);
		FileReader fr = null;
		
		
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	        
	    int i;
	    String temp="";
	    try {
			while ((i=fr.read()) != -1)
				  temp=temp+((char) i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return temp;
	}
	
	ArrayList<Object> toArrayList(String string){
		ArrayList<Object> stringList=new ArrayList<Object>();
		int n;
		System.out.print("What is the length of dataset of block you want?\t-");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int runner=string.length()/n;
		for(int i=0;i<runner;i++){
			stringList.add(string.substring(i*n,(i+1)*n));
		}
		System.out.println("************"+stringList);
		Character check= null;
		try{
			check=string.charAt(string.length()/n+1);
		}
		catch(NullPointerException e){
//			e.printStackTrace();
		}
		if(check!=null){
		String lastString="";
			for(int i=runner*n;i<string.length();i++){
				lastString=lastString+string.charAt(i);
			}
		stringList.add(lastString);
		}
		
		return stringList;
	}
	
	
	
	
	String fileReadingFTP(){

        System.out.println("Connecting to FTP server...");

         // Connection String
         URL url;
         
         Scanner sc = new Scanner(System.in);
 	    System.out.println("Enter Server File Path :-");
 	
 		String serverFile=sc.nextLine();
 		String temp="";
  
         try {
             url = new URL(serverFile);

             URLConnection con = url.openConnection();
             BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

             System.out.println("Reading file start.");

             String inputLine;
             while ((inputLine = in.readLine()) != null)
//                 System.out.println(inputLine);
            	 temp=temp+inputLine;
             in.close();
             }
             catch (FileNotFoundException e) {
                 System.out.println("File not find on server.");
                 System.exit(0);
             }catch (Exception e) {
                 e.printStackTrace();
             }
             System.out.println("Read File Complete.");
             
	return temp;
	}
	

}
