package edu.handong.csee.java.hw3;

import java.io.File;
import java.util.ArrayList;

public class DataReader {
	
	public static void main(String[] args) {
		DataReader dataReader = new DataReader();
		
		dataReader.getData(args[0]);
	}
	
	public ArrayList<String> getData(String strDir){
		File myDir = getDirectory(strDir);
		File[] files = getListOfFilesFromDirectory(getDirectory(strDir));
		ArrayList<String> messages = readFiles(files);
		
		return messages;
		
	}
	
	public File getDirectory(String strDir) {
		File myDirectory = new File(strDir);
		return myDirectory;
	}
	
	public File[] getListOfFilesFromDirectory(File dataDir) {
		for(File file:dataDir.listFiles()) {
			System.out.println(file.getAbsolutePath());
		}
		
		return dataDir.listFiles();
	}
	
	public ArrayList<String> readFiles(File[] files){
		ArrayList<String> messages = new ArrayList<String>();
		
		return messages;
	}
}
