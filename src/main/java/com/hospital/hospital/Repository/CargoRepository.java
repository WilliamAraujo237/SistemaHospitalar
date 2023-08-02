package com.hospital.hospital.Repository;

import com.hospital.hospital.Entidade.Cargo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CargoRepository extends CrudRepository<Cargo,Long> {

    //Query para pegar todos os registros da tabela Cargo
    @Query(value = "SELECT * FROM cargos",nativeQuery = true)
    List<Cargo> SelectCargos();

    //Query para consultar um registro pelo ID
    @Query(value = "SELECT * FROM cargos WHERE id=:ID",nativeQuery = true)
    List<Cargo> SelectCargoID(Long ID);

    //Query para Atualizar um Cargo
    @Modifying
    @Query(value = "UPDATE cargos SET cargo=:cargo,salario=:salario WHERE id=:ID",nativeQuery = true)
    int UpdateCargoID(String cargo,Double salario,Long ID);


    //Query para adicionar um Cargo
    @Modifying
    @Query(value = "INSERT INTO cargos (cargo,salario) VALUES (:cargo,:salario)",nativeQuery = true)
    int InsereCargo(String cargo,Double salario);

    //Query para Deletar um Cargo
    @Modifying
    @Query(value = "DELETE FROM cargos WHERE id=:ID",nativeQuery = true)
    void DeletarCargoID(Long ID);

}
