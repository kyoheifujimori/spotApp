package com.example.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Spot;
import com.example.demo.repositories.SpotRepository;

@Service
public class SpotDataService {

	@Autowired
	private SpotRepository repository;

	public List<? extends SpotDataInterface> getAll() {
		System.out.println("Service:getAll");
		return repository.findAll();
	}

	public SpotDataInterface getById(int spotid) {
		System.out.println("Service:getById id[" + spotid + "]");
		return repository.findById(spotid).orElse(null);
	}

	//	public List<? extends SpotDataInterface> findBySomeOtherPropertyLike(String find) {
	//		System.out.println("Service:getByNameLike find[" + find + "]");
	//		return repository.findBySomeOtherPropertyLike("%" + find + "%");
	//	}

	public int add(SpotDataInterface item) {
		System.out.println("Service:add [" + item + "]");
		if (item instanceof Spot) {
			Spot savedItem = repository.saveAndFlush((Spot) item);
			return savedItem.getSpotId();
		}
		return 0;
	}

	public void delete(SpotDataInterface item) {
		System.out.println("Service:delete[" + item + "]");
		if (item instanceof Spot) {
			repository.delete((Spot) item);
		}
	}

}
