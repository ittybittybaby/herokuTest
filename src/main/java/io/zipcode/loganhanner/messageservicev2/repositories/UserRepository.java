package io.zipcode.loganhanner.messageservicev2.repositories;

import io.zipcode.loganhanner.messageservicev2.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    

}
