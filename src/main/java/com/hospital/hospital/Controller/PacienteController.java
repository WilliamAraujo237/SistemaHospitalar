package com.hospital.hospital.Controller;

import com.hospital.hospital.Entidade.Paciente;
import com.hospital.hospital.Repository.PacienteRepository;
import com.hospital.hospital.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @Autowired
    private PacienteService service;

    //Break Point para Listar todos os pacientes
    @GetMapping("/ListaPacientes")
    public ResponseEntity<?> ListarPacientes(){
        return service.SelectGeralPacientes();
    }

    //Break Point para Registrar um Paciente
    @PostMapping("/RegistraPaciente")
    public ResponseEntity<?> RegistraPaciente(@RequestBody Paciente paciente){
        return service.RegistaPaciente(paciente);
    }

    //Break Point para Modificar um registro de Paciente
    @PutMapping("/ModificaPaciente")
    public ResponseEntity<?> ModificaPaciente(@RequestBody Paciente paciente){
        return service.ModificaPaciente(paciente);
    }

    //Break Point para Deletar um Paciente
    @DeleteMapping("DeletaPaciente/{ID}")
    public void DeletaPaciente(@PathVariable Long ID){
        service.DeletarPaciente(ID);
    }
}
