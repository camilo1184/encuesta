package co.gov.sic.encuesta.mapper;

import co.gov.sic.encuesta.domain.User;
import co.gov.sic.encuesta.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IUserMapper extends IMapperGeneric<User, UserDto> {

    UserDto entityToDto(User user);

}
