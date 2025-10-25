package com.calculadora.materiales.repository;
import com.calculadora.materiales.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends java.io.Serializable, JpaRepository<Material, Long> {
}
