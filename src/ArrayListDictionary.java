
/**
 * The main class that is used to run the Dictionary program, which contains a list of words that is read
 * from a .txt file.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.io.File;

public class ArrayListDictionary {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		ArrayList<DictionaryEntry> section = new ArrayList<DictionaryEntry>();
		File dictionary = new File("wordList.txt");
		Scanner scan = new Scanner(dictionary);

		/**
		 * while loop that goes through the .txt file and splits the words/definitions into 2 different arrays. It 
		 * will then sort the list alphabetically, and print the result.
		 */
		while (scan.hasNextLine()) {

			String line = scan.nextLine();
			String[] details = line.split("	");
			String word = details[0] + ":";
			String definition = details[1];
			DictionaryEntry i = new DictionaryEntry(word, definition);
			section.add(i);
			Collections.sort(section);
			}

		for (DictionaryEntry i : section) {
			System.out.println(i.toString());
		}
		
	}
}