
/*
 * This code is written by Manjot Singh, and under plagiarism
 * of this code in any circumstances will be subject to the
 * copyright issues.
 * 
 * 
 * 
 * Manjot Singh- (Project Developer)
 * */

package rishman;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSONMaker {
	void createJSON(String a){
		
		try{    
	           FileWriter fw=new FileWriter("blockChain.JSON");    
	           fw.write(a);    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	}
}
