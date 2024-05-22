package com.example.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserDataService {

	@Autowired
	private UserRepository repository;

	public List<? extends UserDataInterface> getAll() {
		System.out.println("Service:getAll");
		return repository.findAll();
	}

	public UserDataInterface getByTd(int userid) {
		System.out.println("Service:getById id[" + userid + "]");
		return repository.findById(userid).orElse(null);
	}

	//	//	ユーザ名の検索サービスの追記
	//	public List<? extends UserDataInterface> findByUserName(String userName) {
	//		System.out.println("Service:getByName Name[" + userName + "]");
	//		return repository.findByUserName(userName);
	//	}

	//	public List<? extends UserDataInterface> findByNameLike(String find) {
	//		System.out.println("Service:getByNameLike find[" + find + "]");
	//		return repository.findByNameLike("%" + find + "%");
	//	}

	public int add(UserDataInterface item) {
		System.out.println("Service:add [" + item + "]");
		if (item instanceof User) {
			User savedItem = repository.saveAndFlush((User) item);
			return savedItem.getUserId();
		}
		return 0;
	}

	public void delete(UserDataInterface item) {
		System.out.println("Service:delete[" + item + "]");
		if (item instanceof User) {
			repository.delete((User) item);
		}
	}
}
