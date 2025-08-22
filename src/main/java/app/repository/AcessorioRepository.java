package app.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Acessorio;

public interface AcessorioRepository extends JpaRepository<Acessorio, Long>{

    void deleteByDataCriacaoBefore(LocalDateTime limite);


}
