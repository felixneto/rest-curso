package pt.felixneto.apigateway.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.felixneto.apigateway.data.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
