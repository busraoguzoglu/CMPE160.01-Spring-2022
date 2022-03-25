import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		
		ArrayList<String> fileContents = readFile();
		System.out.println(fileContents);
	}


	/* Reads given file and returns the contents */
	public static ArrayList<String> readFile(){
		ArrayList<String> list = new ArrayList<String>();
		try
		{
			System.out.println("We are executing 'try'");
			//the file to be opened for reading
			FileInputStream fis=new FileInputStream("filename.txt");
			Scanner sc=new Scanner(fis); //file to be scanned
			//returns true if there is another line to read
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				list.add(line);
			}
			sc.close(); //closes the scanner
		}
		catch(IOException e)
		{
			System.out.println("We are executing 'catch'");
			e.printStackTrace();
		}
		System.out.println("Before return");
		return list;
		
	}



}
