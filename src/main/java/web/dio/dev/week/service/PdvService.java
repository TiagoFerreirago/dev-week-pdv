package web.dio.dev.week.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dio.dev.week.model.Pdv;
import web.dio.dev.week.repository.PdvRepository;

@Service
public class PdvService {

	@Autowired
	private PdvRepository pdvRepository;
	
	
	public Pdv findById(Long id) {
		
		return pdvRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Id nao encontrado"));
	}
	
	public void save(Pdv pdv) {
		pdvRepository.save(pdv);
	}
	
	public Pdv update(Pdv pdv) {
		
		Pdv newPdv = pdvRepository.findById(pdv.getId()).orElseThrow(() -> new NoSuchElementException("Id nao encontrado"));
		newPdv.setDesconto(pdv.getDesconto());
		newPdv.setListaProdutos(pdv.getListaProdutos());
		newPdv.setQuantidade(pdv.getQuantidade());
		newPdv.setSubtotal(pdv.getSubtotal());
		newPdv.setTotal(pdv.getTotal());
		return newPdv;
	}
	
	
	public void delete(Long id) {
		
		pdvRepository.deleteById(id);
	}
}
