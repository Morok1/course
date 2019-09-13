package com.smagin.springcore.lazy;

import com.smagin.springcore.autowired.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class Config {
    @Bean
    @Lazy(false)
    Engine engine() {
        return new Engine();
    }
}
