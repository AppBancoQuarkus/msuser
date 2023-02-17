package com.nttd.api;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.nttd.api.request.BankCardRequest;
import com.nttd.api.response.BankCardResponse;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;


@RegisterRestClient
@Path("/bankcard")
public class BankCardApi {
    
    @POST
    public BankCardResponse addBankCard(BankCardRequest bankCardRequest);

}
