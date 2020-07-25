package co.gov.sic.encuesta.mapper;

import co.gov.sic.encuesta.domain.Brand;
import co.gov.sic.encuesta.dto.BrandDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IBrandMapper extends IMapperGeneric<Brand, BrandDto> {

    List<BrandDto> entityListToDtoList(List<Brand> brands);

}
