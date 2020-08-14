package com.example.demo.service;

import com.example.demo.model.Contact;
import java.util.ArrayList;
import java.util.Optional;


public class PhoneBookService {

    private ArrayList<Contact> contactList = new ArrayList<>();
    private Contact contact = new Contact();
    
    public Optional<Contact> findContact(String name, String family) {
        return contactList.stream()
                .filter(contact -> (contact.getFirstName().equals(name)) && (contact.getLastName().equals(family)))
                .findFirst();
    }

    public void addContact(Contact contact) throws Exception {
        Optional<Contact> searchContact = findContact(contact.getFirstName(), contact.getLastName());
        if (searchContact.isPresent())
            throw new Exception("This contact is already exist");
        contactList.add(contact);
    }



}
