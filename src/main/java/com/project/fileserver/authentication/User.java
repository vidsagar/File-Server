package com.project.fileserver.authentication;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("users")
public class User {
    @Id
    String userEmail;
    String userPassword;
    public User(String userEmail, String userPassword){
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
}
