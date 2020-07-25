package co.gov.sic.encuesta.delegate;

import co.gov.sic.encuesta.service.BrandService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class BrandDelegate {

    private final BrandService brandService;

    public BrandDelegate(BrandService brandService) {
        this.brandService = brandService;
    }

    public ResponseEntity findListBrand() {
        return new ResponseEntity(brandService.findListBrand(), HttpStatus.OK);
    }
}
