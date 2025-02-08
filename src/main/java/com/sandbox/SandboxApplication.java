package com.sandbox;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sandbox.mapper.ProductMapper;

@SpringBootApplication
public class SandboxApplication implements CommandLineRunner {

    private final ProductMapper productMapper;

    public SandboxApplication(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(SandboxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("All products: " + productMapper.getAllProducts());
    }

}
