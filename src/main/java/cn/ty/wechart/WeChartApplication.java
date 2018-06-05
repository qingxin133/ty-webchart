package cn.ty.wechart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class WeChartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WeChartApplication.class, args);
	}
	
}
