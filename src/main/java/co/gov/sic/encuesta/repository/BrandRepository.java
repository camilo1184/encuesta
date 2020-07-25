package co.gov.sic.encuesta.repository;

import co.gov.sic.encuesta.domain.Brand;
import co.gov.sic.encuesta.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
