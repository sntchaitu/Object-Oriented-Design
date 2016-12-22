package KMP;


import java.util.*;


public class Kmp implements PatternMatchingStrategy {
	
	//generated random id to name the points csv file uniquely
	UUID uid = UUID.randomUUID(); 
	String pointsFileName =  "Kmp_points"+uid.toString()+".csv";
	
	
	 public String getPointsFileName() {
		return pointsFileName;
	}
	public void setPointsFileName(String pointsFileName) {
		this.pointsFileName = pointsFileName;
	}
	//find all patterns in each text
	 public ArrayList<Long> findAllPatterns(String text, String pattern)
	{
		long startTime = System.nanoTime();
		ArrayList<Long> times = new ArrayList<Long>();
		int []matrix = new int[pattern.length()];
		
		//compute the prefix-suffix table
		generateTable(pattern,matrix);
		
		
		List<Integer> positions = new ArrayList<Integer>();
		

		int p_index=0,s_index=-1;
		for(int t_index=0;t_index<text.length()&&p_index<pattern.length();)
		{
			
			if(text.charAt(t_index)==pattern.charAt(p_index))
			{
				if(s_index==-1)
				{
					s_index = t_index-p_index;

				}
				t_index++;p_index++;
			}
			else
			{
				s_index = -1;
				if(p_index-1>-1)
				{
					p_index = matrix[p_index-1];
				}
				else
				{
					t_index++;
				}
			}
			if(p_index==pattern.length())
			{
				positions.add(s_index);
				p_index = 0;s_index = -1;
			}
		}
		if(p_index==pattern.length())
		{
			positions.add(s_index);
			System.out.println(s_index);
			
		}
		
			long endTime = System.nanoTime();
			long microseconds = (endTime - startTime) / 1000;
			times.add(microseconds);
		
			times.add((long)(text.length()+pattern.length()));
		
			return times;
	}
	 //below function generates prefix table
	 void generateTable(String text,int[] matrix)
	{
		int j=0,i=1;
		while(i<matrix.length)
		{
			if(text.charAt(i)!=text.charAt(j))
			{
				if(j-1>-1)
				{
					j = matrix[j-1];
				}
				else
				{
					matrix[i] =0;
					i++;
				}
				
			}
			else
			{
				matrix[i] = j+1; 
				i++;j++;
			}
		}
		
	}

}
