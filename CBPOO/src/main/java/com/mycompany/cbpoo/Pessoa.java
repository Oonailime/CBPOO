package com.mycompany.cbpoo;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Pessoa {
    //atributos
    private String cpf;
    private String nome;
    private String datanasc;
    private String tituloacademico;
    private String instituicao;
    private String senha;
    
    private boolean inscricao;
    private boolean programchair;
    private boolean generalchair;
    private boolean revisor;
    private boolean autor;

    
    private List<Pessoa> inscritos = new ArrayList();
    private List<Pessoa> programchairs = new ArrayList();
    private List<Pessoa> generalchairs = new ArrayList();
    private List<Pessoa> autores = new ArrayList();
    private List<Pessoa> revisores = new ArrayList();
    
    
    
    
    //construtor
    public Pessoa() {
        
        this.programchair = false;
        this.generalchair = false;
        this.revisor = false;
        this.autor = false;
        this.inscricao = false;
    }

    
    
    
    
    
    
    
    //metodos especiais (get,set)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return datanasc;
        
    }

    public void setDatanasc(String data) {
       
        this.datanasc = data;
    }

    public String getTituloacademico() {
        return tituloacademico;
    }

    public void setTituloacademico(String tituloacademico) {
        this.tituloacademico = tituloacademico;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean isInscricao() {
        return inscricao;
    }

    public void setInscricao(boolean inscricao) {
        this.inscricao = inscricao;
    }
    public boolean isProgramchair() {
        return programchair;
    }

    public void setProgramchair(boolean programchair) {
        this.programchair = programchair;
    }

    public boolean isGeneralchair() {
        return generalchair;
    }

    public void setGeneralchair(boolean generalchair) {
        this.generalchair = generalchair;
    }

    public boolean isRevisor() {
        return revisor;
    }

    public void setRevisor(boolean revisor) {
        this.revisor = revisor;
    }

    public boolean isAutor() {
        return autor;
    }

    public void setAutor(boolean autor) {
        this.autor = autor;
    }

    public List<Pessoa> getInscritos() {
        return inscritos;
    }

    public void setInscritos(List<Pessoa> inscritos) {
        
        this.inscritos = inscritos;
    }

    public List<Pessoa> getProgramchairs() {
        return programchairs;
    }

    public void setProgramchairs(List<Pessoa> programchairs) {
        this.programchairs = programchairs;
    }

    public List<Pessoa> getGeneralchairs() {
        return generalchairs;
    }

    public void setGeneralchairs(List<Pessoa> generalchairs) {
        this.generalchairs = generalchairs;
    }

    public List<Pessoa> getAutores() {
        return autores;
    }

    public void setAutores(List<Pessoa> autores) {
        this.autores = autores;
    }

    public List<Pessoa> getRevisores() {
        return revisores;
    }

    public void setRevisores(List<Pessoa> revisores) {
        this.revisores = revisores;
    }
    
    
    
    

    
}
