package org.tomcscs.toriches.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.tomcscs.toriches.DAO.RegisterDao;
import org.tomcscs.toriches.model.Player;

@Controller
@RequestMapping("/register")

public class AboutRegisterController {

	@Autowired
	RegisterDao registerDao;

	@GetMapping
	public void registerDisplayView() {

	}

	@PostMapping
	public String registerToRichesTable(@RequestParam(required = false) String id, 
			@RequestParam(required = false) String password, @RequestParam(required = false) int balance) {
		
		Player player = new Player(id, password, balance);
		registerDao.save(player);
		
		return "redirect:/index";
		
		
		
				


	}

}
