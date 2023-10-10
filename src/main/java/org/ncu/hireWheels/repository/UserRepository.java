package org.ncu.hireWheels.repository;
import org.ncu.hireWheels.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	User findByEmailIgnoreCase(String email);
	 User findByEmailIgnoreCaseAndPassword(String email, String password);
}
