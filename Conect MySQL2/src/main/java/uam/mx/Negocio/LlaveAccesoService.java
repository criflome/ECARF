package uam.mx.Negocio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uam.mx.Datos.LlaveAccesoRepository;
import uam.mx.Negocio.Dominio.LlaveAcceso;



@Service
public class LlaveAccesoService {

	@Autowired // This means to get the bean called userRepository
	private LlaveAccesoRepository llaveAccesoRepository;

	public boolean addNewLlaveAcceso(LlaveAcceso llave) {
		llaveAccesoRepository.save(llave);
		return true;
	}


	public Collection<LlaveAcceso> getLlaves() {
		// TODO Auto-generated method stub
		return llaveAccesoRepository.findAll();
	}
}
