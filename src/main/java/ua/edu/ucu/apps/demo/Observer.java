package ua.edu.ucu.apps.demo;

import ua.edu.ucu.apps.demo.AppUser.AppUser;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    List<AppUser> list = new ArrayList<>();

    public void addUser(AppUser user) {
        list.add(user);
    }

    public  void removeUser(AppUser user) {
        list.remove(user);
    }

    public void notifyUser(String message) {
        for (AppUser user : list) {
            user.update(message);
        }
    }
}
