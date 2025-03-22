package web.dio.dev.week.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.dio.dev.week.model.Pdv;
import web.dio.dev.week.service.PdvService;

@RestController
@RequestMapping(value = "pdv")
public class PdvController {

	@Autowired
	private PdvService pdvService;
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Pdv>findById(@PathVariable("id")Long id){
		
		return ResponseEntity.ok().body(pdvService.findById(id));
	}
	@PostMapping
	public ResponseEntity<Pdv>save(@RequestBody Pdv pdv){
		pdvService.save(pdv);
		return ResponseEntity.ok().build();
	}
	@PutMapping
	public ResponseEntity<Pdv>update(@RequestBody Pdv pdv){
		
		return ResponseEntity.ok().body(pdvService.update(pdv));
	}
	@DeleteMapping
	public ResponseEntity<Void>delete(@PathVariable("id")Long id){
		pdvService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
