package web.dio.dev.week.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.dio.dev.week.model.Produto;
import web.dio.dev.week.service.ProdutoService;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Produto>findById(@PathVariable("id")Long id){
		
		return ResponseEntity.ok().body(produtoService.findById(id));
	}
	@PostMapping
	public ResponseEntity<Produto>save(@RequestBody Produto produto){
		produtoService.save(produto);
		return ResponseEntity.ok().build();
	}
	@GetMapping
	public ResponseEntity<List<Produto>>findAll(){
		List<Produto> listaProduto = produtoService.findAll();
		return ResponseEntity.ok(listaProduto);
	}
	@DeleteMapping
	public ResponseEntity<Void>delete(@PathVariable("id")Long id){
		produtoService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
