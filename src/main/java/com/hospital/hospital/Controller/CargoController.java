package com.hospital.hospital.Controller;
import com.hospital.hospital.Entidade.Cargo;
import com.hospital.hospital.Repository.CargoRepository;
import com.hospital.hospital.Service.CargoSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Cargo")
public class CargoController {

    @Autowired
    private CargoRepository repository;

    @Autowired
    private CargoSevice sevice;


    //Break point para Listar todos os cargo
    @GetMapping("/ListaCargos")
    public ResponseEntity<?> ListaCargos(){
        return sevice.SelectGeralCargos();
    }

    //Break Point para Registrar um novo cargo
    @PostMapping("/RegistraCargo")
    public ResponseEntity<?> RegistraCargo(@RequestBody Cargo cargo){
        return sevice.RegistraCargo(cargo);
    }

    //Break Point para modificar um registro
    @PutMapping("/ModificaCargo")
    public ResponseEntity<?> ModificaCargo(@RequestBody Cargo cargo){
        return sevice.ModificarCargo(cargo);
    }

    //Break Point para deletar um registro
    @DeleteMapping("/DeletaCargo/{ID}")
    public void DeletaCargo (@PathVariable long ID){
        sevice.DeletaCargo(ID);
    }
}
