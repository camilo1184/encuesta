package co.gov.sic.encuesta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"co.gov.sic.encuesta"})
@EntityScan(basePackageClasses = EncuestaApplication.class)
public class EncuestaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EncuestaApplication.class, args);
    }

}
