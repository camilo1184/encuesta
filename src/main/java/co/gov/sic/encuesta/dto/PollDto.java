package co.gov.sic.encuesta.dto;

import co.gov.sic.encuesta.domain.Brand;
import co.gov.sic.encuesta.domain.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PollDto {

  private Long id;

  public User user;

  public String numberId;

  public String email;

  public String coments;

  private Brand brandType;

  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private LocalDateTime dateResponse;

}
