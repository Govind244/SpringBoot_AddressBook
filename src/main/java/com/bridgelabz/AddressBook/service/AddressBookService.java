package com.bridgelabz.AddressBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.bridgelabz.AddressBook.model.AddressBookModel;
import com.bridgelabz.AddressBook.repository.AddressBookRepository;

@Service
public class AddressBookService {

    @Autowired
    private AddressBookRepository repository;

    public List<AddressBookModel> getAllContacts() {
        return repository.findAll();
    }

    public AddressBookModel getContactById(Long id) {
        Optional<AddressBookModel> contact = repository.findById(id);
        return contact.orElse(null);
    }

    public AddressBookModel addContact(AddressBookModel contact) {
        return repository.save(contact);
    }

    public AddressBookModel updateContact(Long id, AddressBookModel contactDetails) {
        Optional<AddressBookModel> existingContact = repository.findById(id);
        if (existingContact.isPresent()) {
            AddressBookModel contact = existingContact.get();
            contact.setName(contactDetails.getName());
            contact.setPhoneNumber(contactDetails.getPhoneNumber());
            contact.setEmail(contactDetails.getEmail());
            contact.setAddress(contactDetails.getAddress());
            return repository.save(contact);
        }
        return null;
    }

    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}
