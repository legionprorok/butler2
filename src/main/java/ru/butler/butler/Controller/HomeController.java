package ru.butler.butler.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.butler.butler.Repo.DevicesRepo;

@RequestMapping("/home")
public class HomeController {

@GetMapping(path = "/device")
    public String getDev(){
    DevicesRepo.findAll();
    return "index";
}
}
