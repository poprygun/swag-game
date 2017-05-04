package io.pivotal.microsamples.api;

import io.pivotal.microsamples.model.Health;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomizeApiImpl implements RandomizeApi {

    @Override
    public ResponseEntity<Health> health() {
        Health health = new Health();
        health.setHealth("I happen to be alive !!!");
        return new ResponseEntity<Health>(health, HttpStatus.OK);
    }
}
