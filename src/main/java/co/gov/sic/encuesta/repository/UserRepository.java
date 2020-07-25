package co.gov.sic.encuesta.repository;

import co.gov.sic.encuesta.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.userName = :userName and u.password = :password")
    User findUserByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

}
