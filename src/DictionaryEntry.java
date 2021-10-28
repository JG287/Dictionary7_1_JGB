/**
 * 
 * A class that is used for adding entries to an ADT Dictionary
 */
public class DictionaryEntry implements Comparable<DictionaryEntry> {

	private final String word;
	private final String definition;

	public DictionaryEntry(String word, String definition) {
		this.word = word;
		this.definition = definition;
	}
	/**
	 * 
	 * @return return the word
	 */
	public String getWord() {
		return word;
	}
	/**
	 * 
	 * @return retrieves the definition
	 */
	public String getDefinition() {
		return definition;
	}

	public String toString() {
		return this.word + " " + this.definition;
	}
	/**
	 * 
	 * @return compareTo method that compares one entry to another in order to sort the ArrayList.
	 */
	public int compareTo(DictionaryEntry other) {
		
		return this.word.compareTo(other.getWord());
	/**
	 * 
	 * add method that includes an entry to the ArrayList.
	 */
	}
	public void add(String key, String value) {
		
	}
}