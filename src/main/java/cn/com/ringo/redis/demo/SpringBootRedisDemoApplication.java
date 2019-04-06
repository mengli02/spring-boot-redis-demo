package cn.com.ringo.redis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching//开启注解驱动的缓存管理
public class SpringBootRedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisDemoApplication.class, args);
	}

}
