package edu.handong.csee.java.hw3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

public class DataReaderForTXT extends DataReader{

	int[] count = new int[50];
	
	public String[] readtxt(String r1) throws IOException 
	{
	  String[] name = new String[160];
	  try
	  {
		 File file = new File(r1);
		 BufferedReader br = new BufferedReader(new FileReader(file)); 
		 
		 String Line;
		 br.readLine();
		 br.readLine();
		 br.readLine();
		 int i = 0;
		 int n=0 ,N = 0;
		 while((Line = br.readLine()) != null)
		 {
			name[i] = nametxt(Line);
			names3[i] = name[i];
			//System.out.println(names3[i]);
			
			i++;
		 }
		 
		 for(int f =0 ; f <names3.length;f++)
		 {
			 //System.out.println(names3[f]);
			 //counttxt(names3[f]);
		 }
		 br.close();
	  }
	  
	  
	  catch(FileNotFoundException e)
	  {
		 System.out.println("There is not file.");
		 System.exit(0);
	  }
	  
      return name;
    }
	
	public String nametxt(String Line)
	{
		String g = "[";
		if(Line.substring(0, 1).equals(g)) 
		{
		String name = "";
		String pattern = "\\[(.+)\\]\\s\\[..\\s([0-9]+:[0-9]+)\\]\\s(.+)"; 
 		Pattern r = Pattern.compile(pattern);
 		Matcher m = r.matcher(Line);
 		if(m.find())
 		 {
		  name = m.group(1);
		  //System.out.println(name);
		  names.add(name);
 		 }
 		  return name;
		}
		else return null;
	}
	
}