package ro.fasttrackit.trainapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.trainapp.model.entity.Location;
import ro.fasttrackit.trainapp.service.LocationService;

@RestController
@RequestMapping("/locations")
@RequiredArgsConstructor
public class LocationController {
    private final LocationService locationService;

    @PostMapping
    Location addLocation(@RequestBody Location location) {
        return locationService.addLocation(location);
    }

    @DeleteMapping(path = "/{locationId}")
    void deleteLocation(@PathVariable String locationId) {
        locationService.deleteLocation(locationId);
    }
}
