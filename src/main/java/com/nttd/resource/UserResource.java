package com.nttd.resource;

import org.jboss.logging.Logger;

import com.nttd.dto.ResponseDto;
import com.nttd.dto.UserDto;
import com.nttd.service.UserService;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@ApplicationScoped
@Path("/api/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

   @Inject
   UserService userService;

    
   @Inject
   Logger logger;
  
   /* obtener el usuario con cierto filtros */

    @GET
    public Uni<ResponseDto> getAllUser(UserDto userDto){
        logger.info("Iniciando el metodo de obtener el usuario con cierto filtros - Resource.");
        return userService.getAllUser(userDto);
    }

    /* Crear la clave del usuario multicanal */
    @POST
    public Uni<ResponseDto> addUser(UserDto userDto){
        logger.info("Iniciando el metodo de registrar clave del usuario multicanal - Resource.");
        return userService.addUser(userDto);
    }

    /* Modificar la clave del usuario multicanal */
    @PUT
    @Path("{id}")
    public Uni<ResponseDto> updateUser(@PathParam("id") long id,UserDto userDto){
        logger.info("Iniciando el metodo de actualizar la clave del usuario multicanal - Resource.");
        return userService.updateUser(id,userDto);
    }

}
