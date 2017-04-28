package io.pivotal.microsamples.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import io.pivotal.microsamples.config.ClientConfiguration;

@FeignClient(name="${randomizer-client.name:randomizer-client}", url="${randomizer-client.url:http://localhost:8081/v2}", configuration = ClientConfiguration.class)
public interface GuessApiClient extends GuessApi {
}