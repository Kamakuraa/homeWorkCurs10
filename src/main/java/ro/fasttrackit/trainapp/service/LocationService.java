package ro.fasttrackit.trainapp.service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.Store;
import org.springframework.stereotype.Service;
import ro.fasttrackit.trainapp.model.entity.Location;
import ro.fasttrackit.trainapp.repository.LocationRepository;


@Service
@RequiredArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;

    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }

    public void deleteLocation(String locationId) {
        locationRepository.deleteById(locationId);
    }
}
