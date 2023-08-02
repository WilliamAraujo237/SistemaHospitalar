package com.hospital.hospital.Service;

import com.hospital.hospital.Entidade.Cargo;
import com.hospital.hospital.Repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CargoSevice {

    @Autowired
    private CargoRepository repository;


    //Regra para Selecionar todos os cargos
    public ResponseEntity<?> SelectGeralCargos(){
        return new ResponseEntity(repository.SelectCargos(), HttpStatus.OK);
    }

    //Regra para Registrar um cargo
    public ResponseEntity<?> RegistraCargo(Cargo cargo){
        if (cargo.getCargo().equals("") || cargo.getCargo() == null){
            String Mensagem = "O Campo nome não pode estar vazio";
            return new ResponseEntity<>(Mensagem,HttpStatus.BAD_REQUEST);
        } else if (cargo.getSalario()< 1320) {
            String Mensagem = "Valor inserido deve ser maior ou igual a  R$1320";
            return new ResponseEntity<>(Mensagem,HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(repository.InsereCargo(cargo.getCargo(),cargo.getSalario()),HttpStatus.OK);
        }
    }

    //Regra para Modificar um cargo
    public ResponseEntity<?> ModificarCargo(Cargo cargo){
        if (cargo.getCargo().equals("") || cargo.getCargo() == null){
            String Mensagem = "O Campo nome não pode estar vazio";
            return new ResponseEntity<>(Mensagem,HttpStatus.BAD_REQUEST);
        } else if (cargo.getSalario()< 1320) {
            String Mensagem = "Valor inserido deve ser maior ou igual a  R$1320";
            return new ResponseEntity<>(Mensagem,HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(repository.UpdateCargoID(cargo.getCargo(),cargo.getSalario(), cargo.getID()),HttpStatus.OK);
        }
    }

    //Regra para Deletar um Cargo
    public Void DeletaCargo(Long ID){
        repository.deleteById(ID);
        return null;
    }

}
