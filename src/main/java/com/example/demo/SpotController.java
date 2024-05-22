package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.SpotDataInterface;
import com.example.demo.data.SpotDataService;
import com.example.demo.model.Spot;

@RestController
public class SpotController {

	@Autowired
	SpotDataService service;

	@GetMapping("/api/spot")
	@CrossOrigin
	public List<? extends SpotDataInterface> index() {
		System.out.println("/api/spot/index");
		return service.getAll();
	}

	@GetMapping("/api/spot/{id}")
	@CrossOrigin
	public SpotDataInterface fruitById(@PathVariable int SpotId) {
		System.out.println("api/spot/findById");
		return service.getById(SpotId);
	}

	@PostMapping("api/spot/add")
	@CrossOrigin
	public int add(@RequestBody Spot spot) {
		System.out.println("api/spot/add(post)");
		return service.add(spot);
	}

	@PostMapping("/api/spot/update")
	@CrossOrigin
	public int update(@RequestBody Spot spot) {
		System.out.println("api/spot/update(post)");
		return service.add(spot);
	}

	@PostMapping("/api/spot/delete")
	@CrossOrigin
	public void delete(@RequestBody Spot spot) {
		System.out.println("api/spot/delete(post)");
		service.delete(spot);
	}

	//	@PostMapping("/api/find")
	//	@CrossOrigin
	//	public List<? extends SpotDataInterface> find(@RequestParam("find") String find) {
	//		System.out.println("api/find(post)");
	//		return service.findBySomeOtherPropertyLike(find);
	//	}

}
