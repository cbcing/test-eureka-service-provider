package com.cbcing.eruekaserverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EruekaServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EruekaServiceProviderApplication.class, args);
    }
}
