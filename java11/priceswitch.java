package java11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class priceswitch {
	public static void main(String[] args) throws IOException
	{
		int option;
		int price;
		Scanner sc=new Scanner(System.in);
		Path path="C:\\Users\\LCHAPALA\\Downloads\\StudentList.txt";
		String data=Files.readString(Path.of(path));
		System.out.println(data);
	//	BufferedWriter output = new BufferedWriter(new FileWriter(path, true));
		//String file_content = Files.writeString(path,insert());
		System.out.println("Select one option");
		
		switch(option)
		{
		case 1:
		       System.out.println("enter price");
		        price=sc.nextInt();
			Path writeString = Files.writeString(path, data, null);
			Path file_content = writeString
		        
		};
	}
	

}
