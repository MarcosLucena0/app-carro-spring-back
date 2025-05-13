package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Marca;
import app.repository.MarcaRepository;

@Service
public class MarcaService {
	
	@Autowired
	private MarcaRepository marcaRepository;
		
		
	public String save(Marca marca) {
		
		this.marcaRepository.save(marca);
		return "Marca salvo com sucesso";
	}
	
	
	public String update(long id, Marca marca) {
		marca.setId(id);
		this.marcaRepository.save(marca);
		return "Marca atualizado com sucesso";
	}
	
	
	public String delete(long id) {
		
		this.marcaRepository.deleteById(id);
		return "Marca deletado com sucesso";
	}
	
	public List<Marca> listAll(){
		
		List<Marca> lista = this.marcaRepository.findAll();
		return lista;
	}
	
	public Marca findById(long id){
		
		Marca marca = this.marcaRepository.findById(id).get();
		return marca;
	}

}
