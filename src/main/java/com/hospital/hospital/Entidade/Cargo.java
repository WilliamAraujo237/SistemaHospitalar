package com.hospital.hospital.Entidade;

import jakarta.persistence.*;

@Entity

@Table(name = "cargos")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String Cargo;

    private Double Salario;


    //Construtor vazio

    public Cargo() {

    }

    //Construtor com todos os argumentos

    public Cargo(Long ID, String cargo, Double salario) {
        this.ID = ID;
        this.Cargo = cargo;
        this.Salario = salario;
    }

    //Get e Set


    public Long getID() {
        return ID;
    }

    public void setID(Long id) {
        ID = ID;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }
}
