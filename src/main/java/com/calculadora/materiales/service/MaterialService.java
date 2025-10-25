package com.calculadora.materiales.service;

import com.calculadora.materiales.model.Material;
import com.calculadora.materiales.repository.MaterialRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service // Indica que esta clase es un servicio de Spring
public class MaterialService {
    // Inyección del repositorio de materiales
    private final MaterialRepository materialRepository;

    // Constructor para la inyección de dependencias
    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }
    // Método para guardar un material
    public Material guardarMaterial(Material material) {
        return materialRepository.save(material);
    }
    // Método para listar todos los materiales
    public List<Material> listarMateriales() {
        return materialRepository.findAll();
    }
    // Método para eliminar un material por su ID
    public void eliminarMaterial(Long id) {
        materialRepository.deleteById(id);
    }
    // Método para calcular el costo total de un material dado su ID y la cantidad
    public double calcularCostoTotal(Long id, double cantidad) {
        Material material = materialRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Material no encontrado"));
        return material.calcularCostoTotal(cantidad);
    }

}
