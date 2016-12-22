package KMP;

//performs file operations like create,write read from the file
import java.io.*;
import java.util.*;

public class FileManip {

	private File file = null;
	
	private BufferedReader br = null;
	
	
	
	//check if file exists
	public boolean isFileExists(String fName)
   {
	   file = new File(fName);
		if(file.exists() && !file.isDirectory()) { 
		   return true;
		}
		return false;

   }
	
	
	//create a text file
	public void createFile(String fileName)
	{
		try
		{
	
		     
		      if (file.createNewFile())
		      {
		        System.out.println("File is created!");
		      }
		      else{
		        System.out.println("File already exists.");
		      }
	  	} 
		catch (IOException e) 
		{
		      e.printStackTrace();
	  	}
	}
	//read from text file
	public  List<String> readFile(String fname) throws IOException {
		
		   
		    
		    FileInputStream fis = new FileInputStream(file);
		    
			//Construct BufferedReader from InputStreamReader
			 br = new BufferedReader(new InputStreamReader(fis));
		    List<String> res = new ArrayList<String>();
			String line = null;
			while ((line = br.readLine()) != null) {
				if(line.length()>0)
				{
					//System.out.println(line);
					res.add(line);
				}
			}
		 
			br.close();
			return res;
		}
	
	public void deleteFile(String fname)
	{
		File file = new File(fname);
		file.delete();
		
	}
	//write to text file the time duration and (pattern+sequence) length
	public void writeFile(ArrayList<ArrayList<Long>> list,String fname)
	{
		file = new File(fname);
		try {
			FileWriter fw = new FileWriter(file);
			for(int i=0;i<list.size();i++)
			{
				fw.write(list.get(i).get(1)+","+list.get(i).get(0));
				fw.write("\n");
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//write to text file the data set both pattern and text
	public void writeFile(List<String> list,String fname)
	{	
			file = new File(fname);
			try {
				FileWriter fw = new FileWriter(file);
				for(int i=0;i<list.size();i++)
				{
					fw.write(list.get(i));
					fw.write("\n");
				}
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
}
