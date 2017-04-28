package io.pivotal.microsamples.api;

import io.pivotal.microsamples.model.Health;
import io.pivotal.microsamples.randomizer.ApiClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RandomizerTests {


    @Test
    public void shouldReturnRandomizedData() {
        RandomizeApi randomizeApi1 = new ApiClient().buildClient(RandomizeApi.class);
        Health health = randomizeApi1.health();
        assertNotNull(health.getHealth());
    }
}
