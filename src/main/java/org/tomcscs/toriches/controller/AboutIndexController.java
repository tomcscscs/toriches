package org.tomcscs.toriches.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tomcscs.toriches.DAO.IndexDao;
import org.tomcscs.toriches.model.Item;

@Controller
@RequestMapping("/index")

public class AboutIndexController {

	@Autowired
	IndexDao indexDao;

	@GetMapping
	public void indexViewer(Model model) {
		List<Item> itemAll = indexDao.findAll();
		model.addAttribute("itemAll", itemAll);

	}

}
