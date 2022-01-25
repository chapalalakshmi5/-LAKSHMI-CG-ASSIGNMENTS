package java11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class readstudent {
	public static void main(String[] args)throws IOException
	{
		var path="C:\\Users\\LCHAPALA\\Downloads\\StudentList.txt";
		String data=Files.readString(Path.of(path));
		System.out.println(data);
		 String noSpaceStr = data.replaceAll("\\s"," "); // using built in method  
	        System.out.println(noSpaceStr);  
	       
		
		File pa=new File("C:\\Users\\LCHAPALA\\Downloads\\StudentList.txt");
		 FileInputStream fileInputStream = new FileInputStream(pa);
	        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	  
	        String line;
	        int wordCount = 0;
	        int characterCount = 0;
	        int paraCount = 0;
	        int whiteSpaceCount = 0;
	        int sentenceCount = 0;
	        while ((line = bufferedReader.readLine()) != null) {
	            if (line.equals("")) {
	                paraCount += 1;
	            }
	            else {
	                characterCount += line.length();
	                String words[] = line.split("\\s+");
	                wordCount += words.length;
	                whiteSpaceCount += wordCount - 1;
	                String sentence[] = line.split("[!?.:]+");
	                sentenceCount += sentence.length;
	            }
		}

        if (sentenceCount >= 1) {
            paraCount++;
        }
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of paragraphs = "+ paraCount);
        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
    }
		
	}
