package io.github.vibondarenko.foodorder.repo;

import io.github.vibondarenko.foodorder.entity.User;
import org.springframework.data.jpa.repository.*;

public interface UserRepository  extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);
}
