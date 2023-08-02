package com.hospital.hospital.Entidade;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name ="pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String NomePaciente;

    private int Idade;

    private String Sexo;

    private Double CPF;


/*
    //Mapeamento de entidade com a tabela Funcionario

    @ManyToMany
    @JoinTable(
            name = "Tabela_Auxiliar",
            joinColumns = {@JoinColumn(name = "ID_Pacinete",referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "ID_Funcionario",referencedColumnName = "ID")}
    )
    private List<Funcionario> funcionario = new ArrayList<>();

 */

    //construtor vazio
    public Paciente() {

    }

    //Construtor com todos os argumentos

    public Paciente(Long ID, String nomePaciente, int idade, String sexo, Double CPF) {
        this.ID = ID;
        this.NomePaciente = nomePaciente;
        this.Idade = idade;
        this.Sexo = sexo;
        this.CPF = CPF;
    }

    //Get e Set


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNomePaciente() {
        return NomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        NomePaciente = nomePaciente;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public Double getCPF() {
        return CPF;
    }

    public void setCPF(Double CPF) {
        this.CPF = CPF;
    }
}
