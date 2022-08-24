package passport_base.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private Timestamp birthdate;
    private String series;
    private String number;
    private Timestamp created;

    public Passport() {
    }
}
