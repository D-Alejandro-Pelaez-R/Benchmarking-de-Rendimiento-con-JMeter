package com.example.demo_jmeter;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController

@RequestMapping("/api/benchmark")

public class BenchmarkController {



    // ALGORITMO INEFICIENTE: Dos bucles anidados - Complejidad O(n^2)

    @GetMapping("/ineficiente")

    public String procesamientoIneficiente(@RequestParam(defaultValue = "2000") int n) {

        long inicio = System.currentTimeMillis();

        

        long acumulador = 0;

        // Bucle anidado que genera una carga cuadrática O(n^2)

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                acumulador += (i + j) % 3;

            }

        }

        

        long fin = System.currentTimeMillis();

        return "Ineficiente O(n^2) para n=" + n + " completado en: (fin - inicio) = " + (fin - inicio) + " ms. Resultado: " + acumulador;

    }

}