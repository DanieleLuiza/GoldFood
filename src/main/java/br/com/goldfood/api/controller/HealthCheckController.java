package br.com.goldfood.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class Controller referente ao Endpoint health da API
 * 
 * @author Daniele dos Santos
 */
@RestController
@RequestMapping("/health")
public class HealthCheckController {
	/**
     * Método responsável por realizar health check
     * 
     * @return String
     */
    @GetMapping
    public String checkHealth() {
        return "Aplicação está saudável!";
    }

}
