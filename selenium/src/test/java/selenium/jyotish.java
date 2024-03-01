package selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jyotish {

	public static void main(String[] args) {
		
		File directory = new File("C:\\andriod");
		File[] list = directory.listFiles();
		
		try {
			printContents(list);
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void printNames(File[] list) {
		System.out.println("Files: ");
		for(int i=0;i<list.length;i++) {
			if(list[i].isFile()) {
				System.out.println(list[i].getName());
			}
		}
		
	}
public static void printContents(File[] list) throws IOException {
	for(int i=0;i<list.length;i++) {
		String fileName = list[i].getPath();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = null;
		while((line = br.readLine()) !=null){
		System.out.println(line);	
		}
		System.out.println("+================file compelete====================+");
	}
}

}
