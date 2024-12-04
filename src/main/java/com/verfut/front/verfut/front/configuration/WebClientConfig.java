package com.verfut.front.verfut.front.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(WebClient.Builder builder){
        return builder.baseUrl("http://44.202.41.115:8080/api").build();
//        return builder.baseUrl("http://localhost:8080/api").build();
    }
}
