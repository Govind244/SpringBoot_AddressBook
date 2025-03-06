//package com.bridgelabz.AddressBook.repository;
//
//import com.bridgelabz.AddressBook.model.AddressBookModel;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface AddressBookRepository extends JpaRepository<AddressBookModel, Long> {
//}




package com.bridgelabz.AddressBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bridgelabz.AddressBook.model.AddressBookModel;

public interface AddressBookRepository extends JpaRepository<AddressBookModel, Long> {}
