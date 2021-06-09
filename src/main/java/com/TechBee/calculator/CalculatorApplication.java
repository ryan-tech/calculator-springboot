package com.TechBee.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@GetMapping("/add")
	public Integer add(@RequestParam(value = "a", defaultValue = "0") Integer a, @RequestParam(value = "b", defaultValue = "0") Integer b) {
		return a+b;
	}

	@GetMapping("/sub")
	public Integer sub(@RequestParam(value = "a", defaultValue = "0") Integer a, @RequestParam(value = "b", defaultValue = "0") Integer b) {
		return a-b;
	}

	@GetMapping("/mul")
	public Integer mul(@RequestParam(value = "a", defaultValue = "0") Integer a, @RequestParam(value = "b", defaultValue = "0") Integer b) {
		return a*b;
	}

	@GetMapping("/div")
	public Integer div(@RequestParam(value = "a", defaultValue = "0") Integer a, @RequestParam(value = "b", defaultValue = "0") Integer b) {
		if(b == 0) {
			// throw an error
			return 0;
		}
		else {
			return a/b;
		}

	}
}
