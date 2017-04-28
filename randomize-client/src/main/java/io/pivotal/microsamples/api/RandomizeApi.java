package io.pivotal.microsamples.api;

import io.pivotal.microsamples.randomizer.ApiClient;

import io.pivotal.microsamples.model.Health;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T10:28:36.889-04:00")
public interface RandomizeApi extends ApiClient.Api {


  /**
   * Health point
   * All generated responses returned.
   * @return Health
   */
  @RequestLine("GET /randomize")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Health health();
}
