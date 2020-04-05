package tech.adriano;


import feign.RequestLine;

public interface OrderClient {
	
	@RequestLine("POST /order")
	Order createOrder();
}
