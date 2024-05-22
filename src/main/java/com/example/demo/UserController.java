package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.UserDataService;
import com.example.demo.model.User;

@RestController
public class UserController {

	@Autowired
	UserDataService service;

	@PostMapping("api/user/add")
	@CrossOrigin
	public int add(@RequestBody User user) {
		System.out.println("api/user/add(post)");
		return service.add(user);
	}

	@PostMapping("/api/user/update")
	@CrossOrigin
	public int update(@RequestBody User user) {
		System.out.println("api/user/update(post)");
		return service.add(user);
	}

	@PostMapping("/api/user/delete")
	@CrossOrigin
	public void delete(@RequestBody User user) {
		System.out.println("api/spot/delete(post)");
		service.delete(user);
	}

	//	@PostMapping("/api/user/find")
	//	@CrossOrigin
	//	public List<? extends UserDataInterface> find(@RequestParam("find") String find) {
	//		System.out.println("api/user/find(post)");
	//		return service.findByNameLike(find);
	//	}
}
