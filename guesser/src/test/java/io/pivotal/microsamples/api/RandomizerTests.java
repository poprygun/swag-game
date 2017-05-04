package io.pivotal.microsamples.api;

import io.pivotal.microsamples.model.Phrase;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.Assert.assertNotNull;

//@SpringBootTest
//@RunWith(SpringRunner.class)
public class RandomizerTests {

    @Autowired
    private PhraseApiClient phraseApiClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Test
    @Ignore
    public void shouldReturnRandomizedData() {
        ResponseEntity<List<Phrase>> responseEntity = phraseApiClient.allPhrases();
        System.out.println(responseEntity);
        assertNotNull(responseEntity);
    }
}
