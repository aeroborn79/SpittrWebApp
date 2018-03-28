package com.spittr.data;

import java.util.List;

import com.spittr.pojos.Spittle;

public interface SpittleRepository {

	List<Spittle> findSpittles(long max, int count);

}
