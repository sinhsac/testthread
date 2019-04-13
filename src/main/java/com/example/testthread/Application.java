package com.example.testthread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void xxx() {
        ResourceLock lock = new ResourceLock();
        Child1 c1 = new Child1(lock);
        Child2 c2 = new Child2(lock);

        c1.start();
        c2.start();
    }

}
