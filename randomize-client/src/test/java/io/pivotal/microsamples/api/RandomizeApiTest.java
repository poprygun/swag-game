package io.pivotal.microsamples.api;

import io.pivotal.microsamples.randomizer.ApiClient;
import io.pivotal.microsamples.model.Health;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RandomizeApi
 */
public class RandomizeApiTest {

    private RandomizeApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RandomizeApi.class);
    }

    
    /**
     * Health point
     *
     * All generated responses returned.
     */
    @Test
    public void healthTest() {
        // Health response = api.health();

        // TODO: test validations
    }
    
}
