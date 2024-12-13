package com.example.rest;

import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import controller.TDA.list.LinkedList;
import models.Persona;

import controller.dao.services.PersonaServices;
@Path("/personas")
public class PersonaApi {
   @Path("/mispersonas/{codigodelproyecto}")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response getAllpersona(@PathParam("codigodelproyecto") String codigodelproyecto) throws Exception {
       HashMap map = new HashMap<>();
       PersonaServices is = new PersonaServices();
       
       LinkedList<Persona> lista = is.listAll().filter(codigodelproyecto);

       if (lista.isEmpty()) {
           map.put("msg", "ERROR");
           map.put("data", "No se encontraron personas");
       } else {
           map.put("msg", "Lista de personas");
           map.put("data", lista.toArray());
       }

       return Response.ok(map).build();
   }

    @Path("/crear/{codigodelproyecto}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(HashMap map, @PathParam("codigodelproyecto") String codigodelproyecto)  throws Exception {
        HashMap res = new HashMap<>();
        try {
            PersonaServices is = new PersonaServices();
            Persona persona = is.getpersona();
            persona.setNombres(map.get("nombres").toString());
            persona.setDni(map.get("dni").toString());
            persona.setPertenencia(codigodelproyecto);
            is.setpersona(persona);
            is.save();
            res.put("msg", "ok");
            return Response.ok(res).build();
        } catch (Exception e) {
            res.put("msg", "ERROR");
            res.put("data", e.getMessage());   
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(res).build();
        }
    }
}
