package ehospital.nic.demo;

import java.time.LocalDate;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class EhospitalSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhospitalSwaggerApplication.class, args);
	}
	
	@Bean
	  public Docket swaggerConfiguration() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	        .paths(PathSelectors.ant("/api/*"))
	        .apis(RequestHandlerSelectors.basePackage("ehospital.nic.demo"))
	        .build()
	        .apiInfo(apiDetails());
	  }
	private ApiInfo apiDetails()
	{
		return new ApiInfo("eHospital Demo API", 
				"Post and Get operations for Patients API", "1.1",
				"http://ehospital.gov.in", "NOC Tripura", "license", "New Licence");
	}

}
