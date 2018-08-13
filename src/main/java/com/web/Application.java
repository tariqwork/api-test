/**
 * 
 */
package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Main application class for Spring boot
 * contain Main method to start embedded Tomcat
 * 
 * @author Muhammad Tariq
 *
 */
@SpringBootApplication
public class Application {
    /**
     * Main method to start the embedded Tomcat
     * @param args - call arguments
     */
	public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}
