package selenium;

import java.io.File;

public class Get_fill_list {

	public static void main(String[] args) {
		
		String folderPath = "E:\\.metadata";
		File folder = new File(folderPath);
        File[] files = folder.listFiles();
        
        for(File file :files) {
        	if(file.isFile()) {
        		System.out.println("File ->" +file.getName());
        	}else
        		if(file.isDirectory()) {
        			System.out.println("Folder ->"+file.getName());
        		}
        }
	}

}
