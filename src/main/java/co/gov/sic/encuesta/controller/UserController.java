package co.gov.sic.encuesta.controller;

import co.gov.sic.encuesta.delegate.UserDelegate;
import co.gov.sic.encuesta.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired
    UserDelegate userDelegate;

    @PostMapping
    public ResponseEntity authenticateUser(@RequestBody UserDto userDto) {
        return userDelegate.authenticateUser(userDto);
    }
}
