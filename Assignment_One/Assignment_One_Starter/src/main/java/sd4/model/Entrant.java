package sd4.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Entrant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer venue_ID;
    private String logo;
    private String host_City;

    @Temporal(TemporalType.DATE)
    private Date date_Of_Final;

    private String host_Country;
    private String section;
    private String artist;
    private String song;
    private String artist_Country;
    private String running_Order;
    private Integer total_Points;
    private String rank;
    private String qualified;
}
