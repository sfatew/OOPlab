package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GarbageCreator {
public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\GitHub\\OOPlab\\AIMsProject\\src\\hust\\soict\\dsai\\garbage\\Pokemon Changes.txt";
        long startTime, endTime;
        
        List<String> inputLines =  Files.readAllLines(Paths.get(filename));
        startTime = System.
        currentTimeMillis();
        String outputString = "";
        
        for (String line: inputLines) {
            outputString += line;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

	}
}
