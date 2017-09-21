package klfmediatest.jake.wineselector.wine;

import java.util.List;

/**
 * @author Jacob Miller
 * 
 * A service which allows for multiple different ways to select
 * wines from the wine selection stored in the database.
 *
 */
public interface WineSelectorService {

	/**
	 * Returns the {@link Wine} object associated with the supplied ID.
	 * 
	 * @param wineNumber wine number
	 * @return {@code Wine} object
	 */
	public Wine findWineById(int wineNumber);
	
	/**
	 * Returns a {@link List} of {@link Wine} objects based upon the page number supplied. 
	 * 
	 * @param pageNumber page number above 0
	 * @return {@code Wine} object
	 */
	public List<Wine> findWineByPage(int pageNumber);
	
	/**
	 * Returns a {@link List} of {@link Wine} objects. The amount returned is identical to
	 * the {@code amount} supplied.
	 * 
	 * @param amount number of {@code Wine} to return
	 * @return {@code Wine} object
	 */
	public List<Wine> findAmountOfWine(int amount);
}
