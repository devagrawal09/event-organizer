package edu.uc.cech.agrawadv.eventorganizer.dao;
import edu.uc.cech.agrawadv.eventorganizer.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

}
