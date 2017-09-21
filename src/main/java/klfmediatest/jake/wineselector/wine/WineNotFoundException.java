package klfmediatest.jake.wineselector.wine;

public class WineNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6799738944802397134L;
	
	public WineNotFoundException(int wineNumber) {
		super("Wine not found with ID: " + wineNumber);
	}
}
