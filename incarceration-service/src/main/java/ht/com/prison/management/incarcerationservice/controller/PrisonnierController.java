package ht.com.prison.management.incarcerationservice.controller;

import ht.com.prison.management.incarcerationservice.service.PrisonnierService;
import ht.com.prison.management.incarcerationservice.model.Prisonier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("prisonnier-controller")
public class PrisonnierController {
	
	@Autowired
	private PrisonnierService prisonierService;

	@GetMapping(path="/test")
	public void testConnection(HttpServletRequest request){
		System.out.println("Connection ok!");
	}
	
	@PostMapping(path="/salvarPrisonier")
	public void salvarPrisonier(HttpServletRequest request, @RequestBody Prisonier prisonier){
		prisonierService. savePrisonnier(prisonier);
	}

	@GetMapping(path="/prisonniers")
	public @ResponseBody List<Prisonier> listPrisonnier(HttpServletRequest request){
		return prisonierService.listPrisonnier();
	}

	@GetMapping(path="/prisonnier/{id}")
	public @ResponseBody Prisonier getPrisonnierById(HttpServletRequest request, @PathVariable Integer id){
		return prisonierService.getPrisonnierById(id);
	}
}
