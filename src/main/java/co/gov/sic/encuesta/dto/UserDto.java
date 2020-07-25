package co.gov.sic.encuesta.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    private Long id;

    public String userName;

    public String password;

    public String name;

    public boolean state;

}
