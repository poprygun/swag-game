package io.pivotal.microsamples.api;

import io.pivotal.microsamples.randomizer.ApiClient;

import io.pivotal.microsamples.model.Guess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T10:28:36.889-04:00")
public interface GuessApi extends ApiClient.Api {


  /**
   * Finds All Guesses
   * All generated responses returned.
   * @return List&lt;Guess&gt;
   */
  @RequestLine("GET /randomize/allPhrases")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<Guess> allGuesses();
}
