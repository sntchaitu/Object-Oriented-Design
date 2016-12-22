package KMP;

import java.util.ArrayList;

//context class which drives to help to select particular algorithm(either KMP or Z value)
public class AlgorithmContext {
	private PatternMatchingStrategy pms;
	
	public AlgorithmContext(PatternMatchingStrategy pms)
	{
		this.pms = pms;
	}
	
	public ArrayList<Long> findAllPatterns(String text,String pattern)
	{
		return pms.findAllPatterns(text,pattern);
	}
	
	public String getFileName()
	{
		return pms.getPointsFileName();
	}
}
