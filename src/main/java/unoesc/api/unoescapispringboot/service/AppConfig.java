package unoesc.api.unoescapispringboot.service;

import java.net.http.HttpClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HttpClient httpClient() {
        return HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();
    }
}