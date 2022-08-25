package passport_base.service;

import org.springframework.stereotype.Service;
import passport_base.model.Passport;
import passport_base.repositort.PassportRepository;

import java.awt.event.TextEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PassportService {
    private final PassportRepository passportRepository;

    public PassportService(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    public Passport save(Passport passport) {
       return passportRepository.save(passport);
    }

    public boolean update(int id,Passport passport) {
        boolean exists = passportRepository.existsById(id);
        passportRepository.deleteById(id);
        passport.setId(id);
        passportRepository.save(passport);
        return exists;
    }

    public boolean deleteById(int id) {
        boolean exists = passportRepository.existsById(id);
        passportRepository.deleteById(id);
        return exists;
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

    public List<Passport> findByBirthdateAndCreated() {
        List<Passport> rsl = new ArrayList<>();
        passportRepository.findAll().forEach(rsl::add);
        return rsl;
    }
}
