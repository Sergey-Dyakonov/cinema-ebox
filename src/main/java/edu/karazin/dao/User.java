package edu.karazin.dao;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
public class User {
    long id;
    String firstName;
    String lastName;
    String phone;
    String email;
    String password;
}
