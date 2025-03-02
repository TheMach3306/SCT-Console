package meta;

public class Banners extends Strings {

	public Banners() {}
		
	
	// Displays a simple error banner
	public void printError(String...errors) {
		for (String error: errors) {
			System.out.println(String.format("[X] %s", !error.isEmpty() ? error: "String is empty or null => STR_NULL_1"));
		}
	}
	
	// Display a quick, simple progressing banner
	public void printProgress(String...progressing) {
		for (String progress: progressing) {
			print(String.format("[*] %s", !progress.isEmpty() ? progress: "INVALID_PROGRESS_STRING"));
		}
	}
	
	// Display warning banner
	public void printWarning(String...warnings) {
		for (String warning: warnings) {
			print(String.format("[W] %s", !warning.isEmpty() ? warning: "** INVALID STRING, PLEASE CHECK **"));
		}
	}
	
	/**
	 * Prints out the encoded string banner.
	 * 
	 * @param encoding	The encoding used to encode the string..duh
	 * @param normal	The string BEFORE it was encoded
	 * @param encoded	The now encoded string lol
	 */
	public void encodedResultBanner(String encoding, String normal, String encoded) {
		String _e = !encoding.isEmpty() ? encoding: "E => String \"encoding\" cannot be empty...";
		String _n = !normal.isEmpty() ? normal: "E => String \"normal\" cannot be empty...";
		String _d = !encoding.isEmpty() ? encoded: "E => String \"encoded\" cannot be empty";
		
		print(
				String.format("== Normal String:\n\"%s\"\n\n== Encoded using \"%s\" is:\n\"%s\"\n", _n, _e, _d)
				);
	}
}
