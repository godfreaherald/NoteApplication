package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;




@SpringBootApplication
@EnableJpaAuditing
/*The main class for war file packaging
 * You have to add below code to POM.xml either as properties or in the plugins section
 * To support two main classes in this section 
 * extending SpringBootServletInitializer enables war file packaging
 */

public class EasyNotesApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EasyNotesApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EasyNotesApplication.class, args);
    }

}

//The main class for jar file packaging
/*public class EasyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}
}
*/
