package com.cibertec.discoveryservergrupo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerGrupo01Application {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerGrupo01Application.class, args);
    }

}
