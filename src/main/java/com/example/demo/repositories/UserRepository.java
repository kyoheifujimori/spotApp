package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	//	useridからデータを取得するためのクエリの設定
	public Optional<User> findById(int userid);

	//	public List<User> findByNameLike(String key);

	public List<User> findAll();

	//	@Query("from User where UserName :userName")
	//	public List<User> findByUserName(String userName);
}
