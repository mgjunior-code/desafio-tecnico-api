package com.desafio.spring.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Acao {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @NotNull
    private String campo1;

    @NotNull
    private Long campo2;

    @NotNull
    private String idCampoTexto;

    @NotNull
    private Long idCampoNumerico;

    @NotNull
    private String idCampoData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public Long getCampo2() {
        return campo2;
    }

    public void setCampo2(Long campo2) {
        this.campo2 = campo2;
    }

    public String getIdCampoTexto() {
        return idCampoTexto;
    }

    public void setIdCampoTexto(String idCampoTexto) {
        this.idCampoTexto = idCampoTexto;
    }

    public Long getIdCampoNumerico() {
        return idCampoNumerico;
    }

    public void setIdCampoNumerico(Long idCampoNumerico) {
        this.idCampoNumerico = idCampoNumerico;
    }

    public String getIdCampoData() {
        return idCampoData;
    }

    public void setIdCampoData(String idCampoData) {
        this.idCampoData = idCampoData;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Acao other = (Acao) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


}