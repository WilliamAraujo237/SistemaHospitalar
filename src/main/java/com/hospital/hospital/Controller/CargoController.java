package com.hospital.hospital.Controller;
import com.hospital.hospital.Entidade.Cargo;
import com.hospital.hospital.Repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Cargo")
public class CargoController {

    @Autowired
    private CargoRepository repository;

    //Break point para Listar todos os cargo
    @GetMapping("/ListaCargos")
    public Iterable<Cargo> ListaCargos(){
        return repository.findAll();
    }

    //Break Point para Registrar um novo cargo
    @PostMapping("/RegistraCargo")
    public Cargo RegistraCargo(@RequestBody Cargo cargo){
        return repository.save(cargo);
    }

    //Break Point para modificar um registro
    @PutMapping("/ModificaCargo")
    public Cargo ModificaCargo(@RequestBody Cargo cargo){
        return repository.save(cargo);
    }

    //Break Point para deletar um registro
    @DeleteMapping("/DeletaCargo/{ID}")
    public void DeletaCargo (@PathVariable long ID){
        repository.deleteById(ID);
    }
}
