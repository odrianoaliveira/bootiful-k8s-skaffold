package tech.adriano;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTasks {
	
	private static Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
	
	private final OrderClient orderClient;
	
	
	public ScheduledTasks(OrderClient orderClient) {
		this.orderClient = orderClient;
	}
	
	
	@Scheduled(fixedRate = 1000)
	public void reportCurrentTime() {
		Order order = orderClient.createOrder();
		log.info("Order: {}", order);
	}
}
