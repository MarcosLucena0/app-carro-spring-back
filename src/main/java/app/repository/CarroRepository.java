package app.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{
    
    void deleteByDataCriacaoBefore(LocalDateTime limite);

}


