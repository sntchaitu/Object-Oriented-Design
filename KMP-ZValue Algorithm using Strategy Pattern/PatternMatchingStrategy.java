package KMP;

import java.util.*;


//Interface is implemented by KMP and Zalgorithm classes
public interface PatternMatchingStrategy {
	
	public String getPointsFileName();
	
	public ArrayList<Long> findAllPatterns(String text, String pattern);
}
