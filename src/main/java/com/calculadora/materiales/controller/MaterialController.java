package com.calculadora.materiales.controller;

import com.calculadora.materiales.service.MaterialService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/material")
public class MaterialController {
    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @Operation(summary = "Crear un nuevo material")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Material creado exitosamente"),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida"),
            @ApiResponse(responseCode = "404", description = "Material no encontrado")
    })
    @GetMapping("/{id}/calcular-costo")
    public double calcularCostoTotal(Long id, double cantidad) {
        return materialService.calcularCostoTotal(id, cantidad);
    }
}



