package passport_base.service;

import org.springframework.stereotype.Service;
import passport_base.model.Passport;
import passport_base.repositort.PassportRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PassportService {
    private final PassportRepository passportRepository;

    public PassportService(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    Passport save(Passport passport) {
       return passportRepository.save(passport);
    }

    public void delete(Passport passport) {
        passportRepository.delete(passport);
    }

    public List<Passport> findAll() {
        List<Passport> rsl = new ArrayList<>();
        passportRepository.findAll().forEach(rsl::add);
        return rsl;
    }

    public List<Passport> findBySeries(String series) {
        List<Passport> rsl = new ArrayList<>();
        passportRepository.findAll().forEach(rsl::add);
        return rsl;
    }

    public List<Passport> findByBirthdateAndCreated(Date birthdate, Date created) {
        List<Passport> rsl = new ArrayList<>();
        passportRepository.findAll().forEach(rsl::add);
        return rsl;
    }
}
