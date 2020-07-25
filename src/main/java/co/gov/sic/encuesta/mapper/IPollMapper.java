package co.gov.sic.encuesta.mapper;

import co.gov.sic.encuesta.domain.Poll;
import co.gov.sic.encuesta.dto.PollDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IPollMapper extends IMapperGeneric<Poll, PollDto> {

}
