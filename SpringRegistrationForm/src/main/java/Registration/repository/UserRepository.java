package Registration.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Registration.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {



}
