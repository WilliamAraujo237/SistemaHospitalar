package com.hospital.hospital.Entidade;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String Nome;

    private Long Cpf;


    @OneToOne
    @JoinColumn(name = "Codigo_Cargo",referencedColumnName = "Id")
    private Cargo cargo;

/*

    //Mapeamento de entidade com a tabela  pacientes

    @OneToMany(mappedBy = "pacientes")
    private List<Paciente> pacientes = new ArrayList<>();


 */

    //Construtor Vazio
    public Funcionario() {

    }

    //Construtor com todos os argumentos

    public Funcionario(Long ID, String nome, Long cpf) {
        this.ID = ID;
        this.Nome = nome;
        this.Cpf = cpf;
    }

    //Get e Set


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Long getCpf() {
        return Cpf;
    }

    public void setCpf(Long cpf) {
        this.Cpf = cpf;
    }
}
