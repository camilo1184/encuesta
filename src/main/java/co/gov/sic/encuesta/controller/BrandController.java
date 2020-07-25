package co.gov.sic.encuesta.controller;

import co.gov.sic.encuesta.delegate.BrandDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    BrandDelegate brandDelegate;

    @GetMapping
    public ResponseEntity findListBrand() {
        return brandDelegate.findListBrand();
    }
}
