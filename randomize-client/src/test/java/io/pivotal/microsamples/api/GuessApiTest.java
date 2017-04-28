package io.pivotal.microsamples.api;

import io.pivotal.microsamples.randomizer.ApiClient;
import io.pivotal.microsamples.model.Guess;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GuessApi
 */
public class GuessApiTest {

    private GuessApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GuessApi.class);
    }

    
    /**
     * Finds All Guesses
     *
     * All generated responses returned.
     */
    @Test
    public void allGuessesTest() {
        // List<Guess> response = api.allGuesses();

        // TODO: test validations
    }
    
}
