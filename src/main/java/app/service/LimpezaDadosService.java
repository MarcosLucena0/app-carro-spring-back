package app.service;

import java.time.LocalDate;

import org.springframework.scheduling.annotation.Scheduled;

import app.repository.AcessorioRepository;
import app.repository.CarroRepository;
import app.repository.MarcaRepository;

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
    @Scheduled(cron = "0 0 3 * * *")
    public void limparDadosAntigos() {
        LocalDate limite = LocalDate.now().minusDays(1); // expira dados após 1 dia

        carroRepository.deleteByDataCriacaoBefore(limite);
        marcaRepository.deleteByDataCriacaoBefore(limite);
        acessorioRepository.deleteByDataCriacaoBefore(limite);

        System.out.println("Registros antigos foram removidos!");
    }
    
}
