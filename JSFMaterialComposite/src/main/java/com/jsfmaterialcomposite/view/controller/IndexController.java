package com.jsfmaterialcomposite.view.controller;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.PostConstruct;
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
    private Integer slider = 0;
    private Boolean switchTeste = false;
    private Boolean checkboxTeste = false;
    private Date data;

    @PostConstruct
    public void init() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        data = calendar.getTime();
        System.out.println("teste00: " + data);
    }
    
    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public Integer getSlider() {
        return slider;
    }

    public void setSlider(Integer slider) {
        this.slider = slider;
    }

    public Boolean getSwitchTeste() {
        return switchTeste;
    }

    public void setSwitchTeste(Boolean switchTeste) {
        this.switchTeste = switchTeste;
    }

    public Boolean getCheckboxTeste() {
        return checkboxTeste;
    }

    public void setCheckboxTeste(Boolean checkboxTeste) {
        this.checkboxTeste = checkboxTeste;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        System.out.println("testeData: " + data);
        this.data = data; 
    }

    public void submit() {
        System.out.println("slider: " + slider);
        System.out.println("switch: " + switchTeste);
        System.out.println("checkbox: " + checkboxTeste);
        System.out.println("data: " + data);
//        FacesContext.getCurrentInstance().addMessage("test5:test5", new FacesMessage("mensagem", "bolada"));
//        System.out.println("teste1: " + FacesContext.getCurrentInstance().getMessageList("test5:test5").get(0).getDetail());
        System.out.println("teste");
    }
    
}
