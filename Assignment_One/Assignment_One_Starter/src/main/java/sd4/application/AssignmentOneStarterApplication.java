package sd4.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("sd4.model")
public class AssignmentOneStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentOneStarterApplication.class, args);
    }

}
