package io.avalia.users.api.endpoints;

import io.avalia.users.api.UserApi;
import io.avalia.users.entities.UserEntity;
import io.avalia.users.api.model.User;
import io.avalia.users.repositories.UserRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.text.html.Option;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")

@Controller
public class UsersApiController implements UserApi {

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<Object> createUser(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "email", required = true) String email,
                                             @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "password", required = true) String password,
                                             @ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        Optional<UserEntity> admin = userRepository.findByEmailAndPassword(email, password);
        if(admin.isPresent()){
            if(admin.get().getIsAdmin() == 1){
                UserEntity newUserEntity = toUserEntity(user);
                Optional<UserEntity> userInDb = userRepository.findById(newUserEntity.getEmail());
                if(!userInDb.isPresent()) {
                    userRepository.save(newUserEntity);
                    String newEmail = newUserEntity.getEmail();
                    URI location = ServletUriComponentsBuilder
                            .fromCurrentRequest().path("/{email}")
                            .buildAndExpand(newUserEntity.getEmail()).toUri();
                    return ResponseEntity.created(location).build();
                }else {
                    return ResponseEntity.badRequest().body("User already exists");
                }
            }
        }
        return ResponseEntity.badRequest().body("You are not admin");
    }

    public ResponseEntity<Object> getUserByEmail(@ApiParam(value="", required=true) @PathVariable("email") String email) {
        Optional<UserEntity> user = userRepository.findById(email);
        if(user.isPresent()){
            return ResponseEntity.status(200).body(toUser(user.get()));
        }else{
            return ResponseEntity.badRequest().body("No user found");
        }
    }

    public ResponseEntity<Object> changePassword(@NotNull @ApiParam(value = "user email", required = true) @Valid @RequestParam(value = "email", required = true) String email,
                                                 @NotNull @ApiParam(value = "old user password", required = true) @Valid @RequestParam(value = "old password", required = true) String oldPassword,
                                                 @NotNull @ApiParam(value = "new user password", required = true) @Valid @RequestParam(value = "new password", required = true) String newPassword) {
        Optional<UserEntity> user = userRepository.findByEmailAndPassword(email, oldPassword);
        if(user.isPresent()){
            user.get().setPassword(newPassword);
            userRepository.save(user.get());
            return ResponseEntity.status(201).body("Password changed");
        }

        return ResponseEntity.badRequest().body("Wrong email or password");
    }

    private UserEntity toUserEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setEmail(user.getEmail());
        entity.setFirstname(user.getFirstname());
        entity.setLastname(user.getLastname());
        entity.setPassword(user.getPassword());
        entity.setIsAdmin(user.getIsAdmin());

        return entity;
    }

    private User toUser(UserEntity entity) {
        User user = new User();
        user.setEmail(entity.getEmail());
        user.setFirstname(entity.getFirstname());
        user.setLastname(entity.getLastname());
        user.setPassword(entity.getPassword());
        user.setIsAdmin(entity.getIsAdmin());

        return user;
    }

}
