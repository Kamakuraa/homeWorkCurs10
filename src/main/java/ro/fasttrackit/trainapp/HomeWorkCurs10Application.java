package ro.fasttrackit.trainapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.trainapp.model.entity.Location;
import ro.fasttrackit.trainapp.repository.LocationRepository;

import java.util.List;

@SpringBootApplication
public class HomeWorkCurs10Application {

    public static void main(String[] args) {
        SpringApplication.run (HomeWorkCurs10Application.class, args);
    }

//    @Bean
//    CommandLineRunner atStartup(LocationRepository repository) {
//        return args -> {
//            repository.saveAll (List.of (
//                    Location.builder ()
//                            .city ("Oradea")
//                            .build (),
//                    Location.builder ()
//                            .city ("Bucuresti")
//                            .build (),
//                    Location.builder ()
//                            .city ("Brasov")
//                            .build ()
//            ));
//        };
//    }
}
