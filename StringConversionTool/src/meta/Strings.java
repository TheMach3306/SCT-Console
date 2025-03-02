package meta;

public class Strings {
	
	public Strings() {}
	
	// A simpler version of this mouth full "System.out.println()"
	// "NULL_STR" = Debugging string
	public void print(String...strings) {
		for (String string: strings) {
			System.out.println(String.format("%s", !string.isEmpty() || !string.isBlank() ? string: "NULL_STR"));
		}
	}
}
