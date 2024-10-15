package in.balaji.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.balaji.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
