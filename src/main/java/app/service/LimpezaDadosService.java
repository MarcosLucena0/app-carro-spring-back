package app.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.repository.AcessorioRepository;
import app.repository.CarroRepository;
import app.repository.MarcaRepository;

@Service
public class LimpezaDadosService {

    private CarroRepository carroRepository;
    private MarcaRepository marcaRepository;
    private AcessorioRepository acessorioRepository;

    public LimpezaDadosService(CarroRepository carroRepository, MarcaRepository marcaRepository, AcessorioRepository acessorioRepository) {
        this.carroRepository = carroRepository;
        this.marcaRepository = marcaRepository;
        this.acessorioRepository = acessorioRepository;
    }

    // roda todo dia às 3h da manhã
    @Scheduled(fixedRate = 30 * 60 * 1000)
    @Transactional
    public void limparDadosAntigos() {
        LocalDateTime limite = LocalDateTime.now().minusMinutes(5); // expira dados após 30min

        carroRepository.deleteByDataCriacaoBefore(limite);
        marcaRepository.deleteByDataCriacaoBefore(limite);
        acessorioRepository.deleteByDataCriacaoBefore(limite);

        System.out.println("Registros antigos foram removidos!");
    }
    
}
