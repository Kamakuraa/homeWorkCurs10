package ro.fasttrackit.trainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.trainapp.model.entity.Train;

@Repository
public interface TrainRepository extends MongoRepository<Train, String> {
}
