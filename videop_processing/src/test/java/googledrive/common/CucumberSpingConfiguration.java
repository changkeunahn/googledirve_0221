package googledrive.common;


import googledrive.VideopProcessingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideopProcessingApplication.class })
public class CucumberSpingConfiguration {
    
}
