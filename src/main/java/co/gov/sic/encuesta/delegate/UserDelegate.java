package co.gov.sic.encuesta.delegate;

import co.gov.sic.encuesta.service.UserService;
import co.gov.sic.encuesta.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDelegate {

    private final UserService userService;

    public UserDelegate(UserService userService) {
        this.userService = userService;
    }

    /**
     *
     * @param userDto
     * @return
     */
    public ResponseEntity authenticateUser(UserDto userDto) {

        Optional opt = userService.authenticateUser(userDto);
        if(opt.isPresent()) {
            return new ResponseEntity(opt.get(), HttpStatus.OK);
        }

        return new ResponseEntity("User not found", HttpStatus.NO_CONTENT);

    }
}
