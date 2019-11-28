package com.testyantra.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {

	public static void main(String[] args) {
		
		try(FileReader in = new FileReader("csv.txt");//file reader extends reader class
		BufferedReader reader = new BufferedReader(in);
		 )	
		{
			while(reader.ready()) {//return type of ready() is boolean,if there isa line it returns true else it returns false
				//System.out.println(reader.readLine());
				String line = reader.readLine();
				String[] words = line.split(","); // return type is string[]
                 
				System.out.println("id "+words[0]);				
				System.out.println("name "+words[1]);				
				System.out.println("sal "+words[2]);				
				System.out.println("gender"+words[3]);				
				
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
				
	}
}
