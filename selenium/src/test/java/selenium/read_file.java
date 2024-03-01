package selenium;

import java.io.File;
import java.util.Arrays;

public class read_file {

	public static void main(String[] args){
		
		String path ="E:\\.metadata";
		File file = new File(path);
		File downloadDir[] =file.listFiles();
		Arrays.sort(downloadDir);
		
		for(File e : downloadDir) {
			System.out.println("File :" + e.getName());
		}
		
		

	}

}
