package com.bridgelabz.AddressBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.bridgelabz.AddressBook.model.AddressBookModel;
import com.bridgelabz.AddressBook.service.AddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    @GetMapping
    public List<AddressBookModel> getAllContacts() {
        return service.getAllContacts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBookModel> getContactById(@PathVariable Long id) {
        AddressBookModel contact = service.getContactById(id);
        return contact != null ? ResponseEntity.ok(contact) : ResponseEntity.notFound().build();
    }

    @PostMapping("/post")
    public AddressBookModel addContact(@RequestBody AddressBookModel contact) {
        return service.addContact(contact);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressBookModel> updateContact(@PathVariable Long id, @RequestBody AddressBookModel contactDetails) {
        AddressBookModel updatedContact = service.updateContact(id, contactDetails);
        return updatedContact != null ? ResponseEntity.ok(updatedContact) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        service.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}
