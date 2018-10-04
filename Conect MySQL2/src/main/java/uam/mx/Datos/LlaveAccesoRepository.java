package uam.mx.Datos;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uam.mx.Negocio.Dominio.LlaveAcceso;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface LlaveAccesoRepository extends CrudRepository<LlaveAcceso, Long> {
	Collection<LlaveAcceso> findAll();
}
