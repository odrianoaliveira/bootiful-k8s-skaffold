package tech.adriano;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderManagementController {
	
	@PostMapping("/order")
	public Order createOrder() {
		return new Order(UUID.randomUUID().toString(), "created");
	}
	
	
}
