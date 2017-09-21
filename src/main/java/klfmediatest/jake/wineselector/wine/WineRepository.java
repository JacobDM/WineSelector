package klfmediatest.jake.wineselector.wine;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface WineRepository extends CrudRepository<Wine, Integer> {

	@Query("Select w from Wine w")
	public List<Wine> findByPage(Pageable page);
	
}
