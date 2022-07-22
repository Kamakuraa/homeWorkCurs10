package ro.fasttrackit.trainapp.model;

import lombok.Value;
import lombok.With;
import org.springframework.web.bind.annotation.GetMapping;

@Value
@With
public class TrainsFilter {
  String locationId;
  String trainModel;
  Integer minCarts;
  Integer maxCarts;
}
