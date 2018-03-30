package com.spittr.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spittr.pojos.Spittle;

@Repository
public interface SpittleRepository {

	List<Spittle> findSpittles(long max, int count);
	
	Spittle findOne(long id);

}
