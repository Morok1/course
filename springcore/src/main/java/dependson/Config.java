package dependson;

import com.smagin.springcore.autowired.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class Config {
    @Bean
    @DependsOn("bycycle")
    public Car car(){
        return new Car();
    }
}
