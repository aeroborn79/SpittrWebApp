package com.spittr.data;

import com.spittr.pojos.Spitter;

public interface SpitterRepository {

	Spitter save(Spitter spitter);
	Spitter findByUsername(String username);

}
