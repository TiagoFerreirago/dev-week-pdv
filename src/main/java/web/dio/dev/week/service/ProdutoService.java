package web.dio.dev.week.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dio.dev.week.model.Produto;
import web.dio.dev.week.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public Produto findById(Long id) {
		
		return produtoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Id nao encontrado"));
	}
	
	public List<Produto>findAll(){
		
		return produtoRepository.findAll();
	}
	
	public void save(Produto produto) {
		produtoRepository.save(produto);
	}
	
	public void delete(Long id) {
		produtoRepository.deleteById(id);
	}
}

