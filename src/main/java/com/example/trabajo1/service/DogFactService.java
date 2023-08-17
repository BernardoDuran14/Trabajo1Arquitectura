package com.example.trabajo1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.example.trabajo1.model.DogFact;
import org.springframework.web.client.RestTemplate;

@Service
public class DogFactService {
    @Value("${dog.api.url}")
    private String apiUrl;

    @Value("${app.max-results}")
    private int maxResults;
    private final Logger logger = LoggerFactory.getLogger(DogFactService.class);

    public DogFact fetchDogFact() {
        RestTemplate restTemplate = new RestTemplate();
        DogFact dogFact = restTemplate.getForObject(apiUrl, DogFact.class);

        logger.debug("Buscando un dato sobre perros...");
        logger.debug("Datos del perro recuperados: {}", dogFact.getFact());

        return dogFact; // Retorna el objeto obtenido de la API
    }
}

