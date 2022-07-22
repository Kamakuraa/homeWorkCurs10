package ro.fasttrackit.trainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.fasttrackit.trainapp.model.entity.Location;

public interface LocationRepository  extends MongoRepository<Location, String> {
}
