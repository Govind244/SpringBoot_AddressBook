//package com.bridgelabz.AddressBook.dto;
//
//public class AddressBookDTO {
//
//    private String name;
//    private String phoneNumber;
//    private String email;
//    private String address;
//
//    public AddressBookDTO(String name, String phoneNumber, String email, String address) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.address = address;
//    }
//
//    public String getName() { return name; }
//    public String getPhoneNumber() { return phoneNumber; }
//    public String getEmail() { return email; }
//    public String getAddress() { return address; }
//}


package com.bridgelabz.AddressBook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressBookDTO {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
}
