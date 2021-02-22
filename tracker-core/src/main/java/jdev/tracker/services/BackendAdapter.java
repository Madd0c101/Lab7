package jdev.tracker.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BackendAdapter {

    private static final String REQUESTS_ENDPOINT = "/requests";

    private final RestTemplate restTemplate;

 //   @Value("${backend.url}")
    private String backendUrl="127.0.0.1:8080";

    public BackendAdapter(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

    public String getRequests() {
        try {
            restTemplate.getForEntity(backendUrl + REQUESTS_ENDPOINT, String.class);
        }
        catch (NullPointerException n)
        {
            return "";
        }
        ResponseEntity<String> response =restTemplate.getForEntity(backendUrl + REQUESTS_ENDPOINT, String.class);
        return response.toString();
    }
}