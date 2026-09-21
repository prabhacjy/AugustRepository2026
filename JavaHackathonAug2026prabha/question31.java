package tekarchJavaHackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Read a file content and write it to a new file in reverse order.
//(reverse line 1-10 to line 10-1)
public class question31 {

	public static void main(String[] args) throws IOException {
		
		String fileName = "C:\\Users\\prabh\\Documents\\JAVA-PRABHA\\Aug2026JavaHackathon\\Files\\fileread.txt";
		FileReader filereader = new FileReader(fileName);
	
		BufferedReader bufferreader = new BufferedReader(filereader);
	
		List<String> lines = new ArrayList<>();
		String line;
		while ((line = bufferreader.readLine())!= null) {
			System.out.println(line);
			lines.add(line); // creating a list of the lines in the fileread.txt
			}
		Collections.reverse(lines);
		
		FileWriter filewriter = new FileWriter("C:\\Users\\prabh\\Documents\\JAVA-PRABHA\\Aug2026JavaHackathon\\Files\\output.txt");
		
		
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		
		for (String line1 : lines) {
			bufferedwriter.write(line1);
			bufferedwriter.newLine();
		}
		
		bufferreader.close();
		bufferedwriter.close();
		    	
		    
	}

}
