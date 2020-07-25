package co.gov.sic.encuesta.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_name"}, name="uk_user_name")
})
public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name", length = 20)
    public String userName;

    @Column(name = "password", length = 20)
    public String password;

    @Column(name = "name", length = 255)
    public String name;

    @Column(name = "state", length = 1)
    public boolean state;

}
