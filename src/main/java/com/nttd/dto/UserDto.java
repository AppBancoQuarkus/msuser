package com.nttd.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {
    
    // T-tarjeta C-Cliente 
    private String flag_busqueda;
    private String cardnumber;
    private String duedate;
    private int validationcode;
    private String typeCustomer;
	private String numberDocument;
    
    private String flag_account;


    public UserDto() {
    }



    

}
