package ro.fasttrackit.trainapp.model.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;


@Data
@Document(collection = "trains")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Train {
    @Id
    private String trainId;

    private int carts;
    private String model;

    @NonNull
    private String locationId;
}
