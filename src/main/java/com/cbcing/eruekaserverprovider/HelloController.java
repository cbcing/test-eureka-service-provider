package com.cbcing.eruekaserverprovider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        log.info("/hello, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId());
        return "Spring Cloud Eureka Service Provider.";
    }

}
