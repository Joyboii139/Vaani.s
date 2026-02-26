package com.vaanikul.cafe.controller;

import com.vaanikul.cafe.model.MenuItem;
import com.vaanikul.cafe.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MenuController {

    @Autowired
    private CafeService cafeService;

    @GetMapping("/menu")
    public List<MenuItem> getMenu() {
        return cafeService.getAllMenuItems();
    }
}