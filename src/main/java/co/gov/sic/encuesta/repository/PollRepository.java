package co.gov.sic.encuesta.repository;

import co.gov.sic.encuesta.domain.Poll;
import co.gov.sic.encuesta.dto.PollDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PollRepository extends JpaRepository<Poll, PollDto> {

  @Transactional
  @Modifying
  @Query("delete from Poll p where p.id = :id")
  void deletePollById(@Param("id") Long id);
}
