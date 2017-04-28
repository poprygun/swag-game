package io.pivotal.microsamples.api;

import io.pivotal.microsamples.model.Health;
import org.springframework.cloud.netflix.feign.FeignClient;
import io.pivotal.microsamples.config.ClientConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@FeignClient(name="${randomizer-client.name:randomizer-client}", url="${randomizer-client.url:http://localhost:8081/v2}", configuration = ClientConfiguration.class)
public interface RandomizeApiClient extends RandomizeApi {

    @Override
    default ResponseEntity<Health> health() {
        Health health = new Health();
        health.setHealth("I am alive");
        return new ResponseEntity<Health>(health, HttpStatus.OK);
    }
}