package com.nttd.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserEntity  {//extends ReactivePanacheMongoEntity {

    private int id;
    private long code_customer;
    private long code_card;
    private String cardnumber;
    private int password;


    public UserEntity() {
    }
  
    
}
