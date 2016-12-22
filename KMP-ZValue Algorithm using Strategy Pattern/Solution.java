package KMP;

import java.io.*;
import java.util.*;

public class Solution {
	
   
	public final static int startTextLength = 5;
	public final static int endTextLength = 500005;
	public final static int stepTextValue = 4000;
	public static int charSize = 2;
     
	public static int startPatternLength = 3;
	public static int endPatternLength   = 9;
	public static int stepPatternValue   = 1;
	public static int noOfPatterns = -1;
	 UUID uid = UUID.randomUUID(); 
     String textFileName    = "haystack.txt";
     String patternFileName = "needlestack.txt";
     String pointsFileName =  "points"+uid.toString()+".csv";
     
	 GenerateTestData testData = new GenerateTestData();
     FileManip fm = new FileManip();
    
     
    ArrayList<ArrayList<Long>> allTimes = new ArrayList<ArrayList<Long>>();
	
	void writeToFile(List<String> list,String fname)
	{
		if(!fm.isFileExists(fname))
		{
			fm.createFile(fname);
		}
		fm.writeFile(list, fname);
	}
	
	void writeToFile(ArrayList<ArrayList<Long>> list,String fname)
	{
		if(!fm.isFileExists(fname))
		{
			fm.createFile(fname);
		}
		fm.writeFile(list, fname);
	}
	
	List<String> ReadFromFile(String fname) throws IOException
	{
		if(fm.isFileExists(fname))
		{
			return fm.readFile(fname);
			//return null;
		}
		else
		{
			return null;
		}
	}
	
	 void generateData()
	 {
		 //delete previous files
		 fm.deleteFile(textFileName);
		 fm.deleteFile(patternFileName);
		 //generate test data for haystack or sequence
		 List<String> hayStack = testData.generateHayStack(charSize,startTextLength,endTextLength,stepTextValue);
		 
		 //writeTo file
		 writeToFile(hayStack,textFileName);
		 
		 noOfPatterns = hayStack.size();
		 // generate test data for needle or pattern
		 List<String> needleStack = testData.generateNeedleStack(charSize,startTextLength,noOfPatterns);
		 
		 
		 //write To file
		 writeToFile(needleStack,patternFileName);
		 
		 
		 
	 }
	 void deleteFile(String fname)
	 {
		 if(fm.isFileExists(fname))
		 {
			 fm.deleteFile(fname);
		 }
		 else
		 {
			 
		 }
	 }
	 
	 void process(AlgorithmContext alc) throws IOException
	 {
		 
        
		 //read from testfile
		 List<String> hayStack = ReadFromFile(textFileName);
		 
		 //read from patternfile 
		 List<String> needleStack = ReadFromFile(patternFileName);
		 
		 //run pattern matching algo for each test set
		 for(int i=0;i<hayStack.size();i++)
		 {
			 //ArrayList<Long> times = kmp.findPattern(hayStack.get(i), needleStack.get(i));
			 ArrayList<Long> times = alc.findAllPatterns(hayStack.get(i), needleStack.get(i));
			 allTimes.add(times);
		 }
		 fm.writeFile(allTimes, alc.getFileName());
		 System.out.println("Graph needs to be plotted");
		 //plot graph
		 
		 
		
	 }
	 
	public static void main(String args[]) throws IOException
	{
	    
		Solution s1 = new Solution();
		s1.generateData();
	    AlgorithmContext alc  = new AlgorithmContext(new Kmp());
		s1.process(alc);
		alc  = new AlgorithmContext(new Zalgorithm());
		s1.process(alc);
		
		
	
	}
}
