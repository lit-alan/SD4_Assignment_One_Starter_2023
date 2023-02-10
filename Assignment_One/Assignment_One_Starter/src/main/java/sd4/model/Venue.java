package sd4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer venue_ID;
    String name;
    Integer capacity;
    String note;
}

