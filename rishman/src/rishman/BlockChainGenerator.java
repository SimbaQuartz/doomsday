
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

import java.util.ArrayList;
import java.util.LinkedList;
import com.google.*;
import com.google.gson.GsonBuilder;

public class BlockChainGenerator {
	BlockChainGenerator(){
		System.out.println("Running Block Chain Generator");
	}
	
	public LinkedList<Block> blockHasher(ArrayList<String> stringFile){
		LinkedList<Block> blockChain=new LinkedList<Block>();
		blockChain.add(new Block(stringFile.get(0),"0"));
		for(int i=1;i<stringFile.size();i++){
			blockChain.add(new Block(stringFile.get(i),blockChain.getLast().hash));
		}

		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);		
		System.out.println(blockchainJson);
		
		JSONMaker jsmkr=new JSONMaker();
		jsmkr.createJSON(blockchainJson);
		
		return blockChain;
	}
	
}
