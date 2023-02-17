package com.nttd.api;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.nttd.api.request.CustomerRequest;
import com.nttd.api.response.CustomerResponse;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@RegisterRestClient
@Path("/customer")
public class CustomerApi {
    

    @POST
    public CustomerResponse addCustomer(CustomerRequest customer);

}
