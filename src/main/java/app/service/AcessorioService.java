package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Acessorio;
import app.repository.AcessorioRepository;

@Service
public class AcessorioService {
	
	@Autowired
	private AcessorioRepository acessorioRepository;
	
	
	public String save(Acessorio acessorio) {
		
		this.acessorioRepository.save(acessorio);
		return "Acessorio salvo com sucesso";
	}
	
	
	public String update(long id, Acessorio acessorio) {
		acessorio.setId(id);
		this.acessorioRepository.save(acessorio);
		return "acessorio atualizado com sucesso";
	}
	
	
	public String delete(long id) {
		
		this.acessorioRepository.deleteById(id);
		return "acessorio deletado com sucesso";
	}
	
	public List<Acessorio> listAll(){
		
		List<Acessorio> lista = this.acessorioRepository.findAll();
		return lista;
	}
	
	public Acessorio findById(long id){
		
		Acessorio acessorio = this.acessorioRepository.findById(id).get();
		return acessorio;
	}

}
