package controller.dao;


import controller.dao.implement.AdapterDao;
import controller.TDA.list.LinkedList;
import models.Persona;
public class PersonaDao extends AdapterDao<Persona> {
    private Persona persona;
    private LinkedList<Persona> listAll;

    public PersonaDao(){
        super(Persona.class);
    }

    public Persona getpersona(){
        if(persona == null) {
            persona = new Persona();
        }
        return this.persona;
    }
    
    public void setProyecto(Persona persona) {
        this.persona = persona;
    }

    public LinkedList<Persona> getListAll(){
        if (this.listAll == null) {
            this.listAll = listAll();
        }
        return this.listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize()+1;
        getpersona().setIdpersona(id);
        persist(getpersona());
        return true;
    }

    public Boolean update() throws Exception {
        this.merge(getpersona(), getpersona().getIdpersona() - 1);
        this.listAll = listAll();
        return true;
    }
}
