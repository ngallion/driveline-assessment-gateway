package net.stlgamers.hittraxreportergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class HittraxReporterGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HittraxReporterGatewayApplication.class, args);
	}
}
