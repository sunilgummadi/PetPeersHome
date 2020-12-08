package com.hcl.pp.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.pp.model.Pet;
import com.hcl.pp.service.PetService;

@Controller
public class HomeController {
	@Autowired
	private PetService petServiceImp;
	@RequestMapping(value = "pets")
	public String displayUser(Model model) {
		List<Pet> petList = petServiceImp.getAllPets();
		model.addAttribute("pets",petList);
		return "pet_home";
	}
	
}
