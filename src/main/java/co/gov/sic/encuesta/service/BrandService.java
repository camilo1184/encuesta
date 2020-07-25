package co.gov.sic.encuesta.service;

import co.gov.sic.encuesta.dto.BrandDto;
import co.gov.sic.encuesta.mapper.IBrandMapper;
import co.gov.sic.encuesta.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    IBrandMapper brandMapper;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<BrandDto> findListBrand(){
        return brandMapper.entityListToDtoList(brandRepository.findAll());
    }

}
