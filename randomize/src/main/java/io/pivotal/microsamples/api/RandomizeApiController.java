package io.pivotal.microsamples.api;

import io.pivotal.microsamples.model.Health;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-28T09:58:46.624-04:00")

@RestController
public class RandomizeApiController implements RandomizeApi {

    @Override
    public ResponseEntity<Health> health() {
        Health health = new Health();
        health.setHealth("I happen to be alive !!!+++++++");
        return new ResponseEntity<Health>(health, HttpStatus.OK);
    }
}
