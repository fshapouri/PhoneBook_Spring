package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.PhoneBookService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PhoneBookController {
    PhoneBookService phoneBookService = new PhoneBookService();

    @GetMapping("/contact")
    public void finsContact (@RequestParam String name, @RequestParam String family){
        phoneBookService.findContact(name , family);
    }

    @PostMapping("/insert")
    public void addContact(@RequestBody Contact contact) throws Exception {
        phoneBookService.addContact(contact);
    }


}
