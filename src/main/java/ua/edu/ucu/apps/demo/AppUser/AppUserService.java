package ua.edu.ucu.apps.demo.AppUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        AppUser customer = new AppUser(1, "Bohdan", "My_mail", LocalDate.now(), 19);
        appUserRepository.save(customer);
        return appUserRepository.findAll();
    }

    public void addUser(AppUser user) {
        if (!appUserRepository.findByEmail(user.getEmail())) {
            appUserRepository.save(user);
        }
    }
}
