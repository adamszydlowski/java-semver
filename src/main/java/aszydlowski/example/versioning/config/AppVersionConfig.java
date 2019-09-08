package aszydlowski.example.versioning.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/version.properties")
class AppVersionConfig {

}
