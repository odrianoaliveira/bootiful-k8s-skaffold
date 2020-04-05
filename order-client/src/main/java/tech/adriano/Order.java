package tech.adriano;

import java.util.StringJoiner;

public class Order {
	
	private final String id;
	private final String status;
	
	
	public Order(String id, String status) {
		this.id = id;
		this.status = status;
	}
	
	
	public String getId() {
		return id;
	}
	
	
	public String getStatus() {
		return status;
	}
	
	
	@Override
	public String toString() {
		return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
				.add("id='" + id + "'")
				.add("status='" + status + "'")
				.toString();
	}
}
