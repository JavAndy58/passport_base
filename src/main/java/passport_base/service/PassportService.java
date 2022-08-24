package passport_base.service;

import org.springframework.stereotype.Service;
import passport_base.model.Passport;
import passport_base.repositort.PassportRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassportService {
    private final PassportRepository passportRepository;

    public PassportService(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    public void save(Passport passport) {
        passportRepository.save(passport);
    }

    public void delete(Passport passport) {
        passportRepository.delete(passport);
    }

    public List<Passport> findAll() {
        List<Passport> rsl = new ArrayList<>();
        passportRepository.findAll().forEach(rsl::add);
        return rsl;
    }
}
