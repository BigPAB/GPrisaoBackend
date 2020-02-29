package ht.com.prison.management.controller;

import ht.com.prison.management.service.GardeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ht.com.prison.management.model.Garde;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("garde-controller")
public class GardeController {
	
	@Autowired
	private GardeService gardeService;
	
	@PostMapping(path="/saveGarde")
	public void saveGarde(HttpServletRequest request, @RequestBody Garde garde){
		gardeService. saveGarde(garde);
	}

	@GetMapping(path="/gardes")
	public @ResponseBody List<Garde> listGarde(HttpServletRequest request){
		return gardeService.listGarde();
	}

	@GetMapping(path="/garde/{id}")
	public @ResponseBody Garde getGardeById(HttpServletRequest request, @PathVariable Integer id){
		return gardeService.getGardeById(id);
	}
}
