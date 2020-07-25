package co.gov.sic.encuesta.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
public class Poll {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_poll")
  @SequenceGenerator(name = "seq_poll", sequenceName = "seq_poll", initialValue = 1, allocationSize = 1)
  private Long id;

  @JoinColumn(name = "id_user", nullable = false)
  @ManyToOne(optional = false, fetch = FetchType.EAGER)
  public User user;

  @Column(name = "number_id")
  public String numberId;

  @Column(name = "email")
  public String email;

  @Column(name = "coments")
  public String coments;

  @OneToOne
  @JoinColumn(name = "brand", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_poll"))
  private Brand brandType;

  @Column(name = "date_response")
  @CreatedDate
  private LocalDateTime dateResponse;

  @PrePersist
  public void prePersist(){
    this.dateResponse = LocalDateTime.now();
  }

}
