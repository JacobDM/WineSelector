package klfmediatest.jake.wineselector.test.wine;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import klfmediatest.jake.wineselector.wine.Wine;
import klfmediatest.jake.wineselector.wine.WineNotFoundException;
import klfmediatest.jake.wineselector.wine.WineSelectorService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WineSelectorTests {

	@Autowired
	private WineSelectorService wineSelectorService;
	
	private final int VALID_WINE_NUMBER = 1;
	private final int INVALID_WINE_NUMBER = 9999999;
	
	@Test
	public void shouldSuccessfullyReturnWineAndNotThrowException() {
		final Wine wine = wineSelectorService.findWineById(VALID_WINE_NUMBER);
		Assert.assertTrue(wine != null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionAsWineNumberLessThan0() {
		wineSelectorService.findWineById(-1);
	}
	
	@Test(expected = WineNotFoundException.class)
	public void shouldThrowWineNotFoundExceptionAsWineNumberInvalid() {
		wineSelectorService.findWineById(INVALID_WINE_NUMBER);
	}
	
	@Test
	public void shouldSuccessfullyReturnListOfWines() {
		final List<Wine> wines = wineSelectorService.findWineByPage(1);
		
		Assert.assertTrue(wines != null);
		Assert.assertFalse(wines.isEmpty());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionWhenPageLessThan1() {
		wineSelectorService.findWineByPage(0);
	}
	
	@Test
	public void shouldSuccessfullyReturnAmountOfWineSpecified() {
		final int amount = 50;
		final List<Wine> wine = wineSelectorService.findAmountOfWine(50);
		
		Assert.assertEquals(amount, wine.size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionWhenAmountSpecifiedLessThan1() {
		wineSelectorService.findAmountOfWine(0);
	}
}
