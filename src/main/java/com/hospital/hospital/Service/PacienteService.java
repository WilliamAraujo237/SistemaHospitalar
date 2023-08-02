package com.hospital.hospital.Service;

import com.hospital.hospital.Entidade.Paciente;
import com.hospital.hospital.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    //Regra para registrar um Paciente novo
    public ResponseEntity<?> RegistaPaciente(Paciente paciente){
        if (paciente.getNomePaciente().equals("")){
            String Mensagem = "O campo Nome não pode estar vazio";
            return new ResponseEntity<>(Mensagem, HttpStatus.BAD_REQUEST);
        } else if (paciente.getCPF() == null) {
            String Mensagem  = "O campo CPF não pode estar Vazio";
            return new ResponseEntity<>(Mensagem,HttpStatus.BAD_REQUEST);
        } else if (paciente.getIdade() <= 0 ) {
            String Mensagem = "A idade não pode ser menos ou igual a 0";
        } else if (paciente.getSexo() != "M" || paciente.getSexo() !="F") {
                String Mensagem = "O sexo não pode ser diferente de F = Feminino ou M = Masculino";
                return new ResponseEntity<>(Mensagem,HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(repository.save(paciente),HttpStatus.OK);
        }
        return null;
    }

    //Regra para Modificar um Paciente
    public ResponseEntity<?> ModificaPaciente(Paciente paciente){
        if (paciente.getNomePaciente().equals("")){
            String Mensagem = "O campo Nome não pode estar vazio";
            return new ResponseEntity<>(Mensagem, HttpStatus.BAD_REQUEST);
        } else if (paciente.getCPF() == null) {
            String Mensagem  = "O campo CPF não pode estar Vazio";
            return new ResponseEntity<>(Mensagem,HttpStatus.BAD_REQUEST);
        } else if (paciente.getIdade() <= 0 ) {
            String Mensagem = "A idade não pode ser menos ou igual a 0";
        } else if (paciente.getSexo() != "M" || paciente.getSexo() !="F") {
            String Mensagem = "O sexo não pode ser diferente de F = Feminino ou M = Masculino";
            return new ResponseEntity<>(Mensagem,HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(repository.save(paciente),HttpStatus.OK);
        }
        return null;
    }

    //Regra para pegar todos os registros dos pacientes
    public ResponseEntity<?> SelectGeralPacientes(){
        return new ResponseEntity<>(repository.findAll(),HttpStatus.OK);
    }

    //Regras para Deletar um Paciente
    public void DeletarPaciente(Long ID){
        repository.deleteById(ID);
    }
}
