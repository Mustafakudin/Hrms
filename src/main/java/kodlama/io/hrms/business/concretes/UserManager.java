package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.dataAccess.abstracts.UserDao;
import kodlama.io.hrms.entities.concretes.User;


@Service
public class UserManager implements UserService {
	@Autowired
	private UserDao userDao;  
	
	
	public UserManager() {
		
	}
	

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

}
