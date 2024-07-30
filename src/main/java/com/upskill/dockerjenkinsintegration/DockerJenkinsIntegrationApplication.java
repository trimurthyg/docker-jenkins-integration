package com.upskill.dockerjenkinsintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {

    public static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationApplication.class);

    public void init() {
        logger.info("Welcome to DockerJenkinsIntegration.....");
    }

    public static void main(String[] args) {
        logger.info("Welcome to DockerJenkinsIntegration completed....");
        SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
    }

}
