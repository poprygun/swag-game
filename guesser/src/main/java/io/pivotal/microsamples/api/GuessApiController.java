package io.pivotal.microsamples.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-27T12:18:22.805-04:00")

@Controller
public class GuessApiController implements GuessApi {


    @Override
    public ResponseEntity<String> health() {
        String response = "{\"health\" : \"I am alive!!!!\"}";
        ResponseEntity<String> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
        return responseEntity;
    }
}
