package ro.fasttrackit.trainapp.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.trainapp.exception.ValidationException;
import ro.fasttrackit.trainapp.model.TrainsFilter;
import ro.fasttrackit.trainapp.model.entity.Train;
import ro.fasttrackit.trainapp.repository.TrainDao;
import ro.fasttrackit.trainapp.repository.TrainRepository;
import ro.fasttrackit.trainapp.service.validator.TrainValidator;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TrainService {
    private final TrainRepository trainRepository;
    private final TrainValidator validator;
    private final TrainDao trainDao;

    public Train addTrain(Train train) {
        validator.validateLocationThrow(train.getLocationId());
        return trainRepository.save(train);
    }

    public void deleteTrain(String trainId) {
        trainRepository.deleteById(trainId);
    }

    public Train updateTrain(String trainId, Train train) {
        train.setTrainId(trainId);
        validator.validateReplaceThrow(trainId, train);

        Train dbTrain = trainRepository.findById(trainId)
                .orElseThrow(() -> new ValidationException ("Couldn't find train with id " + trainId));
        copyTrain(train, dbTrain);
        return trainRepository.save(dbTrain);
    }

    private void copyTrain(Train train, Train dbTrain) {
        dbTrain.setCarts(train.getCarts());
        dbTrain.setLocationId(train.getLocationId());
        dbTrain.setModel(train.getModel());
    }

    public List<Train> getAllByFilters(TrainsFilter filters) {
        return trainDao.getAll(filters);
    }
}
