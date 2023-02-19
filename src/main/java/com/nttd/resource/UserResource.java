package com.nttd.resource;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.jboss.logging.Logger;

import com.nttd.dto.ResponseDto;
import com.nttd.dto.UserDto;
import com.nttd.service.UserService;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;



@Path("/api/user")
public class UserResource {

   @Inject
   UserService userService;

    
   @Inject
   Logger logger;

 
   /* obtener el usuario con cierto filtros */
    @GET
    @Operation(summary = "Obtener el usuario con cierto filtros",description = "Obtienes el usuario con cierto filtros")
    public Uni<ResponseDto> getAllUser(UserDto userDto){
        logger.info("Iniciando el metodo de obtener el usuario con cierto filtros - Resource.");
        // return userService.getAllUser(userDto);
        return null;
    }


    /* Crear la clave del usuario multicanal */
    @POST
    @Operation(summary = "Crear clave web en multicanal",description = "Registrar la clave del usuario multicanal")
    public Uni<ResponseDto> addUser(UserDto userDto){
        logger.info("Iniciando el metodo de registrar clave del usuario multicanal - Resource.");
        // return userService.addUser(userDto);
        return null;
    } 

    /* Modificar la clave del usuario multicanal */
    @PUT
    @Path("{id}")
    @Operation(summary = "Modificar clave web en multicanal",description = "Permite modificar la clave del usuario multicanal")
    public Uni<ResponseDto> updateUser(@PathParam("id") long id,UserDto userDto){
        logger.info("Iniciando el metodo de actualizar la clave del usuario multicanal - Resource.");
        //return userService.updateUser(id,userDto);
        return null;
    }

}
