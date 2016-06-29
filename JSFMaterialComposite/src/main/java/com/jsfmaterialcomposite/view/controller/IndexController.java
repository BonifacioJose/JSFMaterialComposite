package com.jsfmaterialcomposite.view.controller;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Bonifácio
 */
@Named
@ViewScoped
public class IndexController implements Serializable {
    
    private String teste;

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }
    
    public void submit() {
        FacesContext.getCurrentInstance().addMessage("test5:test5", new FacesMessage("mensagem", "bolada"));
        System.out.println("teste1: " + FacesContext.getCurrentInstance().getMessageList("test5:test5").get(0).getDetail());
        System.out.println("teste");
    }
    
}
