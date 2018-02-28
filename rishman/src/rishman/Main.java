package rishman;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Client Side Application.");
		System.out.println("It is recommented for you to start Server Side FTP server. You can also upload the file locally.");
		System.out.println("Start the Server Side Application, and enter it's IP Address");
		String ServerIp=sc.nextLine();
		
		
		BlockChainGenerator b=new BlockChainGenerator();
		FileReading fileReading=new FileReading();
		ArrayList stringyfiedList= new ArrayList();
		
		System.out.println("Through what way you want to upload File? ftp/local");
		String mode=sc.nextLine();
		
		if(mode.equals("local")){
		stringyfiedList=fileReading.toArrayList(fileReading.startReading());
		}

		if(mode.equals("ftp")){
			stringyfiedList=fileReading.toArrayList(fileReading.fileReadingFTP());
		}
		System.out.println("stringyfiedList is "+stringyfiedList);
		b.blockHasher(stringyfiedList);

		FileClient client = new FileClient(ServerIp, 1988, "blockChain.JSON");

	}
	
	

}
