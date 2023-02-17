package com.nttd.entity;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserEntity  extends ReactivePanacheMongoEntity {

    private ObjectId id;
    private long code_customer;
    private long code_card;
    private String cardnumber;
    private int password;


    public UserEntity() {
    }
  
    
}
