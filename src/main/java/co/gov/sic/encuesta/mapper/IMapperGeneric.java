package co.gov.sic.encuesta.mapper;

public interface IMapperGeneric<T, D> {

    T dtoToEntity(D dto);
}
