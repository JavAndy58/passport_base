package passport_base.repositort;

import org.springframework.data.repository.CrudRepository;
import passport_base.model.Passport;
import java.util.Date;
import java.util.List;


public interface PassportRepository extends CrudRepository<Passport, Integer> {
    List<Passport> findBySeries(String series);
    List<Passport> findByBirthdateAndCreated(Date birthdate, Date created);
}
