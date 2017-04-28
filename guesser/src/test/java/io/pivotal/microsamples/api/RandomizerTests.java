package io.pivotal.microsamples.api;

import io.pivotal.microsamples.model.Health;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RandomizerTests {

    @Autowired
    private RandomizeApiClient randomizeApiClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Test
    public void shouldReturnRandomizedData() {
        ResponseEntity<Health> health = randomizeApiClient.health();
        Health body = health.getBody();
        List<String> services = discoveryClient.getServices();
        assertNotNull(body);
    }
}
