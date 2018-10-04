package uam.mx.Negocio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uam.mx.Datos.UserRepository;
import uam.mx.Negocio.Dominio.User;

@Service
public class UserService {

	@Autowired // This means to get the bean called userRepository
	private UserRepository userRepository;

	public boolean addNewUser(User n) {
		userRepository.save(n);
		return true;
	}


	public Collection<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}
