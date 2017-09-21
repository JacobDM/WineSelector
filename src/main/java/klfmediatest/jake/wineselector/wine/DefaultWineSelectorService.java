package klfmediatest.jake.wineselector.wine;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DefaultWineSelectorService implements WineSelectorService {

	@Autowired
	private WineRepository wineRepository;
	
	@Override
	public Wine findWineById(int wineNumber) {
		Validate.isTrue(wineNumber > 0);
		final Wine wine = wineRepository.findOne(wineNumber);
		if (wine == null) {
			throw new WineNotFoundException(wineNumber);
		}
		return wine;
	}

	@Override
	public List<Wine> findWineByPage(int pageNumber) {
		Validate.isTrue(pageNumber > 0);
		return wineRepository.findByPage(new PageRequest(pageNumber - 1, 100));
	}

	@Override
	public List<Wine> findAmountOfWine(int amount) {
		Validate.isTrue(amount > 0);
		return wineRepository.findByPage(new PageRequest(0, amount));
	}

}
