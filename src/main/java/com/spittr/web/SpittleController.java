package com.spittr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spittr.data.SpittleRepository;
import com.spittr.pojos.Spittle;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	
	private SpittleRepository spittleRepository;

	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Spittle> spittles() {
		return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
	}

}
