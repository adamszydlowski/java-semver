package aszydlowski.example.versioning;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppSettings.class)
public class JavaSemverApplication implements ApplicationRunner {

    private final AppSettings appSettings;

    public JavaSemverApplication(AppSettings appSettings) {
        this.appSettings = appSettings;
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaSemverApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application version: " + appSettings.getVersion());
    }
}
