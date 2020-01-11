package io.avalia.users.repositories;

import io.avalia.users.entities.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

/**
 * Created by Olivier Liechti on 26/07/17.
 */
public interface UserRepository extends PagingAndSortingRepository<UserEntity, String> {
    Optional<UserEntity> findByEmailAndPassword(String email, String password);
}
