package controller.dao;


import controller.dao.implement.AdapterDao;
import controller.TDA.list.LinkedList;
import models.Inversionista;
public class InversionistaDao extends AdapterDao<Inversionista> {
    private Inversionista inversionista;
    private LinkedList<Inversionista> listAll;

    public InversionistaDao(){
        super(Inversionista.class);
    }

    public Inversionista getInversionista(){
        if(inversionista == null) {
            inversionista = new Inversionista();
        }
        return this.inversionista;
    }
    
    public void setProyecto(Inversionista inversionista) {
        this.inversionista = inversionista;
    }

    public LinkedList<Inversionista> getListAll(){
        if (this.listAll == null) {
            this.listAll = listAll();
        }
        return this.listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize()+1;
        getInversionista().setIdInversionista(id);
        persist(getInversionista());
        return true;
    }

    public Boolean update() throws Exception {
        this.merge(getInversionista(), getInversionista().getIdInversionista() - 1);
        this.listAll = listAll();
        return true;
    }
}
