package converter.encoder;

import meta.Banners;

/**
 * This object allows the string to be encoded via the specified algorithm. These algorithms are: binary, hexadecimal, base58, base64.
 * These are pretty standard algorithms but, they are also the most common.
 */
public class Encoder {
	// Data structure
	private String stringToEncode;
	
	// Secondary Objects
	private StringBuilder builder;
	private Banners banner = new Banners();
	
	public Encoder() {}
	
	public Encoder(String stringToEncode) {
		this.stringToEncode = stringToEncode;
	}
	
	// Setters and getters - Set something, get its value
	public void setStringToEncode(String stringToEncode) { this.stringToEncode = stringToEncode; }
	
	public String getStringToEncode() { return !this.stringToEncode.isEmpty() ? this.stringToEncode: "Invalid source string, is it empty?..."; }
	
	// Main runtime
	public void string2Binary() {
		// Get the strings character array
		// Iterate through that character array and convert the characters, then build the string
		char[] chars = this.stringToEncode.toCharArray();
		builder = new StringBuilder();
		
		for (char ch: chars) {
			builder.append(
					String.format("%8s", Integer.toBinaryString(ch)).replaceAll(" ", "0")
					);
		}
		
		// Display result
		banner.encodedResultBanner("Binary", this.stringToEncode, builder.toString());
	}
}
