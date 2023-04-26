package repositories;

import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User usuario_01 = new User(null, "Adão", "adao@gmail.com", "61999999999", "a1b2c3");
    User usuario_02 = new User(null, "Eva", "eva@gmail.com", "61999999999", "1a2b3c");
    userRepository.saveAll(Arrays.asList(usuario_01, usuario_02));

}
