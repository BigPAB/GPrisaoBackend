package ht.com.prison.management.incarcerationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class IncarcerationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncarcerationServiceApplication.class, args);
    }

}
