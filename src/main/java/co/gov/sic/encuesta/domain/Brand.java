package co.gov.sic.encuesta.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "brand", uniqueConstraints = {
  @UniqueConstraint(columnNames = {"description"}, name = "uk_brand_description")
})
public class Brand {

  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "description", length = 40)
  public String description;

}
