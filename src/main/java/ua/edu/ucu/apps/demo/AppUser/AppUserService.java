package ua.edu.ucu.apps.demo.AppUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        AppUser appUser = new AppUser(1, "Bohdan", "My_male");
        appUserRepository.save(appUser);
        return appUserRepository.findAll();
    }
}
