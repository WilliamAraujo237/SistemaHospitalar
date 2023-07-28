package com.hospital.hospital.Controller;

import com.hospital.hospital.Entidade.Funcionario;
import com.hospital.hospital.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping("/ListaFuncionarios")
    public Iterable<Funcionario> ListaFuncionarios(){
        return repository.findAll();
    }

    @PostMapping("/RegistraFuncionario")
    public Funcionario cadastrarFuncionario(@RequestBody Funcionario funcionario){
        return repository.save(funcionario);
    }

    @PutMapping("/ModificaFuncionario")
    public Funcionario ModificaFuncionario(@RequestBody Funcionario funcionario){
        return repository.save(funcionario);
    }

    @DeleteMapping("/DeletarFuncionario/{id}")
    public void  DeletaFuncionario(@PathVariable Long id){
        repository.deleteById(id);
    }
}
