package com.hospital.hospital.Repository;

import com.hospital.hospital.Entidade.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario,Long> {
}
