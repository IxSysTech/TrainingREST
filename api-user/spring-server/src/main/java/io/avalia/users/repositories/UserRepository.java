package io.avalia.users.repositories;

import io.avalia.users.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Olivier Liechti on 26/07/17.
 */
public interface UserRepository extends CrudRepository<UserEntity, String>{
    Optional<UserEntity> findByEmailAndPassword(String email, String password);
}
