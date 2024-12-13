package controller.dao.services;

import controller.dao.PersonaDao;
import controller.TDA.list.LinkedList;
import models.Persona;
public class PersonaServices {
    private PersonaDao obj;
    public PersonaServices(){
        obj = new PersonaDao();
    }

    public Boolean save() throws Exception {
        return obj.save();
    }

    public Boolean update() throws Exception {
        return obj.update();
    }

    public LinkedList<Persona> listAll(){
        return obj.getListAll();
    }

    public Persona getpersona(){
        return obj.getpersona();
    }

    public void setpersona(Persona persona) {
        obj.setProyecto(persona);
    }

    public Persona get(Integer id) throws Exception {
        return obj.get(id);
    }
}
