package tech.adriano;

import feign.Feign;
import feign.gson.GsonDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {
	
	@Bean
	OrderClient orderClient() {
		return Feign.builder()
				.decoder(new GsonDecoder())
				.target(OrderClient.class, "http://localhost:9090");
	}
	
}
