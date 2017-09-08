/* 17Aug2017 R Wyant: This came from an example in a SpringBoot tutorial found here:
 * 
 * https://spring.io/guides/gs/serving-web-content/
 * 
 * I'm using this as a basis for future work. The parts I wrote were:
 * 
 * - GreetingController2.java and it's unit test
 * - Html5examples.java
 * 
 */

// Test edit from master part 2!
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("If you're reading this, the latest is running.");
    }

}
