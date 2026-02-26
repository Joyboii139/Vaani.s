package com.vaanikul.cafe.service;

import com.vaanikul.cafe.model.MenuItem;
import com.vaanikul.cafe.model.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import java.util.List;

@Service
public class CafeService {

    @Autowired
    private MenuRepository menuRepository;

    @PostConstruct
    public void loadMenu() {
        if (menuRepository.count() == 0) {
            // Coffees
            menuRepository.save(new MenuItem("South Indian Filter Coffee", "Coffee", 250));
            menuRepository.save(new MenuItem("Flat White", "Coffee", 250));
            menuRepository.save(new MenuItem("Cold Brew", "Coffee", 300));
            menuRepository.save(new MenuItem("Affogato", "Coffee", 320));
            menuRepository.save(new MenuItem("Mocha", "Coffee", 350));
            menuRepository.save(new MenuItem("Ice Latte", "Coffee", 350));
            // Teas
            menuRepository.save(new MenuItem("Masala Chai", "Tea", 50));
            menuRepository.save(new MenuItem("Darjeeling First Flush", "Tea", 100));
            menuRepository.save(new MenuItem("Assam Kadak Chai", "Tea", 120));
            menuRepository.save(new MenuItem("Kashmiri Kahwa", "Tea", 250));
            menuRepository.save(new MenuItem("Sulaimani Chai", "Tea", 350));
            // Snacks
            menuRepository.save(new MenuItem("Britannia Biscuits", "Snack", 50));
            menuRepository.save(new MenuItem("Parle Cookies", "Snack", 80));
            menuRepository.save(new MenuItem("Fresh Bun", "Snack", 60));
            menuRepository.save(new MenuItem("Butter Toast", "Snack", 100));
        }
    }

    public List<MenuItem> getAllMenuItems() {
        return menuRepository.findAll();
    }
}