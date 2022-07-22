package ro.fasttrackit.trainapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@Document(collection = "locations")
@NoArgsConstructor
@Builder
public class Location {
    @Id
    private String locationId;

    private String city;
}
