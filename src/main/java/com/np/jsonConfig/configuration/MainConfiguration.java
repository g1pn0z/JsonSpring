package com.np.jsonConfig.configuration;


import com.np.jsonConfig.bean.MainConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean
    public MainConfig morningRoutingNote(){
        return new MainConfig("a. work1 b. work2 c. work3");
    }
}
