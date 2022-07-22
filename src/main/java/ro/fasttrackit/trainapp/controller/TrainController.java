package ro.fasttrackit.trainapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.trainapp.model.TrainsFilter;
import ro.fasttrackit.trainapp.model.entity.Train;
import ro.fasttrackit.trainapp.service.TrainService;

import java.util.List;

@RestController
@RequestMapping("/trains")
@RequiredArgsConstructor
public class TrainController {
    private final TrainService trainService;

    @GetMapping
    List<Train> getAll(TrainsFilter filters) {
        return trainService.getAllByFilters(filters);
    }

    @PostMapping
    Train addTrain(@RequestBody Train train) {
        return trainService.addTrain(train);
    }

    @PutMapping(path = "/{trainId}")
    Train updateTrain(@PathVariable String trainId, @RequestBody Train train) {
        return trainService.updateTrain(trainId, train);
    }

    @DeleteMapping(path = "/{trainId}")
    void deleteTrain(@PathVariable String trainId) {
        trainService.deleteTrain(trainId);
    }
}
