package com.nttd.resource;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.jboss.logging.Logger;

import com.nttd.dto.ValidationUserDto;
import com.nttd.entity.UserEntity;
import com.nttd.service.UserService;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("/api/user")
public class UserResource {

   @Inject
   UserService userService;


   @Inject
   Logger logger;

 
   /* obtener el usuario filtrando por Tarjeta*/
    @GET
    @Path("/{cardnumber}")
    @Operation(summary = "Validando la tarjeta del cliente",description = "Obtienes el id filtrando por Tarjeta")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<ValidationUserDto> getValidationCard(@PathParam("cardnumber") String cardnumber){
        logger.info("Iniciando el metodo de obtener el id de tarjeta - Resource.");
        return userService.getValidationCard(cardnumber);
    }

     /* obtener el usuario filtrando por Cliente*/
     @GET
     @Path("/{tipocliente}/{customernumber}")
     @Operation(summary = "Obtener el id del cliente",description = "Obtienes el id del cliente.")
     @Produces(MediaType.APPLICATION_JSON)
     public Uni<ValidationUserDto> getValidationCustomer(@PathParam("tipocliente") String tipocliente,
                                                         @PathParam("customernumber") String customernumber){
         logger.info("Iniciando el metodo de obtener el id del cliente - Resource.");
         return userService.getValidationCustomer(tipocliente,customernumber);
     }

      /* obtener true :acceso al multicanal, false: no tienes acceso */
      @GET
      @Path("/acceso/{cardnumber}/{password}")
      @Operation(summary = "Obtener el id del cliente",description = "Obtienes el id del cliente.")
      @Produces(MediaType.APPLICATION_JSON)
      public Uni<Boolean> getAccesoMulticanal(@PathParam("cardnumber") String cardnumber,
                                                          @PathParam("password") String password){
          logger.info("Iniciando el metodo de validation de acceso - Resource.");
          return userService.getAccesoMulticanal(cardnumber,password);
      }


    /* Crear la clave del usuario multicanal */
    @POST
    @Operation(summary = "Crear clave web en multicanal",description = "Registrar la clave del usuario multicanal")
    public Uni<UserEntity> addUser(UserEntity userEntity){
        logger.info("Iniciando el metodo de registrar clave del usuario multicanal - Resource.");
        return userService.addUser(userEntity);
    } 

    /* Modificar la clave del usuario multicanal */
    @PUT
    @Path("{id}")
    @Operation(summary = "Modificar clave web en multicanal",description = "Permite modificar la clave del usuario multicanal")
    public Uni<UserEntity> updateUser(@PathParam("id") String id,UserEntity userEntity){
        logger.info("Iniciando el metodo de actualizar la clave del usuario multicanal - Resource.");
        return userService.updateUser(id,userEntity);
    }

    /* Eliminar los usuarios no vigentes */
    @DELETE
    @Path("{id}")
    @Operation(summary = "Eliminar los usuarios no vigentes en multicanal",description = "Permite eliminar los usuarios no vigentes en multicanal")
    public Uni<UserEntity> deleteUser(@PathParam("id") String id){
        logger.info("Iniciando el metodo eliminar el usuario multicanal - Resource.");
        return userService.deleteUser(id);
    }



}
