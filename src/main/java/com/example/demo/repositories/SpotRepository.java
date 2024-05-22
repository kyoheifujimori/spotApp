package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Spot;

@Repository
public interface SpotRepository extends JpaRepository<Spot, Integer> {

	//	spotidからデータを取得するためのクエリの設定
	public Optional<Spot> findById(int spotid);

	//	public List<Spot> findBySomeOtherPropertyLike(String SpotName);

	public List<Spot> findAll();
}
