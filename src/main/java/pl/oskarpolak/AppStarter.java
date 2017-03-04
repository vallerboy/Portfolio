package pl.oskarpolak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by OskarPraca on 2017-03-04.
 */

@ComponentScan
@EnableAutoConfiguration
public class AppStarter {
       public  static void main(String[] args){
           SpringApplication.run(AppStarter.class, args);
       }
}
