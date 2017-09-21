package klfmediatest.jake.wineselector.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import klfmediatest.jake.wineselector.wine.Wine;
import klfmediatest.jake.wineselector.wine.WineDto;
import klfmediatest.jake.wineselector.wine.WineSelectorService;
/**
 * @author Jacob Miller
 * 
 * Controller for handling of {@link Wine} listing.
 *
 */
@RestController
@RequestMapping("/api/wine")
public class WineController {

	@Autowired
	private WineSelectorService wineSelectorService;
	
	/**
	 * Returns a {@link Wine} or {@link List} of {@code Wine} objects depending on 
	 * the parameters supplied. This is a 2 in 1 action controller as both the singular
	 * wine listing by id and the page number listing return the name only. This approach makes
	 * sense from a REST stand point as the name belongs to wine so /api/wine/name is appropriate for
	 * both types of requests.
	 * 
	 * @param wineNumber wine id
	 * @param pageNumber page number
	 * @return singular or list of {@code Wine} names
	 */
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public Object getWine(@RequestParam(name = "id", required = false) Integer wineNumber,
						   @RequestParam(name = "page", required = false) Integer pageNumber) {
		if (wineNumber != null) {
			final Wine wine = wineSelectorService.findWineById(wineNumber);
			return new WineDto().setProdName(wine.getProdName());
		} else if (pageNumber != null) {
			return wineSelectorService.findWineByPage(pageNumber).stream().map(w -> new WineDto()
					.setProdName(w.getProdName())).collect(Collectors.toList());
		}
		
		throw new IllegalArgumentException("No valid parameter supplied.");
	}

	/**
	 * Returns the first 50 wine names and prices found within the database. Could've been
	 * shorter with a {@code .stream()} call but would be a bit difficult to read as multiple
	 * setters are invoked within the iteration of the {@link Wine} list.  
	 * 
	 * @return list of {@code Wine} information
	 */
	@RequestMapping(value = "/pricing-list", method = RequestMethod.GET)
	public List<WineDto> getFirst50Wines() {
		final List<Wine> wine = wineSelectorService.findAmountOfWine(50);
		final List<WineDto> wineList = new ArrayList<>();
		for (final Wine w : wine) {
			final WineDto wineDto = new WineDto();
			wineDto.setProdName(w.getProdName());
			wineDto.setChargePerPerson(w.getChargePerPerson());
			wineList.add(wineDto);
		}
		return wineList;
	}
	
	/**
	 * Similar to the 1st controller for /name but requires 5 parameters and not just name. The 5 fields required were
	 * never specified so I simply selected the first 5 fields in the products table.
	 * 
	 * @param wineNumber wine id
	 * @return list of {@code Wine} information
	 */
	@RequestMapping(method = RequestMethod.GET)
	public WineDto getDetailedWineInfo(@RequestParam("id") int wineNumber) {
		final Wine wine = wineSelectorService.findWineById(wineNumber);
		return new WineDto().setProdID(wine.getProdID())
				.setProdNum(wine.getProdNum()).setProdName(wine.getProdName())
				.setColorId(wine.getColorId()).setProdPack(wine.getProdPack());
	}
}
