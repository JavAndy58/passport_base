package passport_base.repositort;

import org.springframework.data.repository.CrudRepository;
import passport_base.model.Passport;

public interface PassportRepository extends CrudRepository<Passport, Integer> {
}
