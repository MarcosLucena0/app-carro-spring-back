package app.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

    void deleteByDataCriacaoBefore(LocalDateTime limite);


}
