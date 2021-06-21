package webCondominio.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Namespace;
import webCondominio.controller.ControllerConexion;
import webCondominio.model.ModelPerfilUsuario;

import java.util.ArrayList;

public class ActionResidentes  extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("Entramos a admin");
        ControllerConexion residente = new ControllerConexion();
        listaResidentes = residente.getResidentes(0);
        residente.cerrarSession();

        return SUCCESS;
    }

private ArrayList<ModelPerfilUsuario> listaResidentes;

    public ArrayList<ModelPerfilUsuario> getListaResidentes() {
        return listaResidentes;
    }

    public void setListaResidentes(ArrayList<ModelPerfilUsuario> listaResidentes) {
        this.listaResidentes = listaResidentes;
    }
}
