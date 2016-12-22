package KMP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateTestData {
	static int startValue = 97;
	
	//generates all test cases for pattern
	public List<String> generateNeedleStack(int noOfChars,int startLength,int noOfPatterns)
	{
		
		List<String> finalList = new ArrayList<String>();
		char[] chars = new char[noOfChars];
		for(int i=startValue;i<(startValue+noOfChars);i++)
		{
			chars[i-startValue] = (char)i;
		}
		
		Random random = new Random();
		for(int i = 0;i<noOfPatterns;i++)
		{
			StringBuilder sb1 = new StringBuilder();
			for(int j=0;j<startLength;j++)
			{
				char c = chars[random.nextInt(chars.length)];
				sb1.append(c);
			}
		
			finalList.add(sb1.toString());
			
		}
		
	    return finalList;
	}
	
	
	
	
	//generates all test cases for text
	public List<String> generateHayStack(int noOfChars,int startLength,int endLength,int step)
	{
		List<String> finalList = new ArrayList<String>();
		char[] chars = new char[noOfChars];
		for(int i=startValue;i<(startValue+noOfChars);i++)
		{
			chars[i-startValue] = (char)i;
		}
		
		Random random = new Random();
		for(int i = startLength;i<=endLength;i = i+step)
		{
			StringBuilder sb1 = new StringBuilder();
			for(int j=0;j<i;j++)
			{
				char c = chars[random.nextInt(chars.length)];
				sb1.append(c);
			}
		
			finalList.add(sb1.toString());
			
		}
		
	    return finalList;
	}
}
