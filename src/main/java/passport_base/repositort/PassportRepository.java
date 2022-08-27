package passport_base.repositort;

import org.springframework.data.repository.CrudRepository;
import passport_base.model.Passport;
import java.util.Date;
import java.util.List;


public interface PassportRepository extends CrudRepository<Passport, Integer> {
    Passport save(Passport passport);
    boolean update(int id, Passport passport);
    boolean deleteById(int id);
    List<Passport> findBySeries(String series);
}
