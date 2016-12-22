package KMP;
import java.util.*;
public class Zalgorithm implements PatternMatchingStrategy{
	//generated random id to name the points csv file uniquely
	UUID uid = UUID.randomUUID(); 
	String pointsFileName =  "ZAlgo_points"+uid.toString()+".csv";
	
	public String getPointsFileName() {
		return pointsFileName;
	}

	public void setPointsFileName(String pointsFileName) {
		this.pointsFileName = pointsFileName;
	}

	//Below module will compute Z value for a given pattern 
	 void computeZ(StringBuilder pattern,int Z[])
	{
		int leftPointer =0,rightPointer=0;
		for(int i=1;i<pattern.length();i++)
		{
			if(i>rightPointer)
			{
				leftPointer=rightPointer=i;
				while(rightPointer<pattern.length() && pattern.charAt(rightPointer-leftPointer)==pattern.charAt(rightPointer))
				{
					rightPointer++;
				}
				Z[i] = rightPointer-leftPointer;
				rightPointer--;
			}
			else
			{
				int k = i-leftPointer;
				//if the same pattern found and it has length less than maximum Z box
				if (Z[k] < rightPointer-i+1)
				{ 
					Z[i] = Z[k];
				}
				//if the same pattern found and it has length greater than maximum Z box
			    else
			    {
			      leftPointer = i;
			      while (rightPointer < pattern.length() && pattern.charAt(rightPointer-leftPointer) == pattern.charAt(rightPointer))
			      {
			    	  rightPointer++;
			      }
			      Z[i] = rightPointer-leftPointer; 
			      rightPointer--;
			    }
			}
		}
	}
	 
    //finds  pattern in specific text
	int findPattern(String text,String pattern)
	{
		StringBuilder res = new StringBuilder();
		res.append(pattern);
		res.append('$');
		res.append(text);
		
		int[]z = new int[res.length()];
		computeZ(res,z);
		for(int i=0;i<res.length();i++)
		{
			if(z[i]==pattern.length())
			{
				return i-(pattern.length()+1);
			}
		}
		return -1;
	}
	
	
	//finds all patterns in specific text
	public ArrayList<Long> findAllPatterns(String text,String pattern)
	{
		
		long startTime = System.nanoTime();
		
		StringBuilder res = new StringBuilder();
		res.append(pattern);
		res.append('$');
		res.append(text);
		List<Integer> allIndexes = new ArrayList<Integer>();
		ArrayList<Long> times = new ArrayList<Long>();
		int[]z = new int[res.length()];
		computeZ(res,z);
		for(int i=0;i<res.length();i++)
		{
			if(z[i]==pattern.length())
			{
				allIndexes.add(i-(pattern.length()+1));
			}
		}
		long endTime = System.nanoTime();
		long microseconds = (endTime - startTime) / 1000;
		times.add(microseconds);

		times.add((long)(text.length()+pattern.length()));
		return times;
		
	}


}
