package com.hospital.hospital.Repository;

import com.hospital.hospital.Entidade.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente,Long> {

}
