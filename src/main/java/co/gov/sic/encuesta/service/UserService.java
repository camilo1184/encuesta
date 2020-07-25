package co.gov.sic.encuesta.service;

import co.gov.sic.encuesta.dto.UserDto;
import co.gov.sic.encuesta.domain.User;
import co.gov.sic.encuesta.mapper.IUserMapper;
import co.gov.sic.encuesta.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    IUserMapper userMapper;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserDto> authenticateUser(UserDto userDto){
        User user = userRepository.findUserByUserNameAndPassword(userDto.userName, userDto.password);
        return Optional.ofNullable(userMapper.entityToDto(user));
    }

}
