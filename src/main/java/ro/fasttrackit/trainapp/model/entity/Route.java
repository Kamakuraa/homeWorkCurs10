package ro.fasttrackit.trainapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "routes")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Route {
    private String routeId;

    private int length;
    private String startLocationId;
    private String destinationLocationId;
    private String trainId;

}
