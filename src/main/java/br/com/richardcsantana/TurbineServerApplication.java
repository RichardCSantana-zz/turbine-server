package br.com.richardcsantana;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringCloudApplication
@EnableTurbineStream
@EnableHystrixDashboard
public class TurbineServerApplication {

	public static void main(final String[] args) {
		SpringApplication.run(TurbineServerApplication.class, args);
	}
}
