package co.gov.sic.encuesta.service;

import co.gov.sic.encuesta.domain.Poll;
import co.gov.sic.encuesta.dto.PollDto;
import co.gov.sic.encuesta.mapper.IPollMapper;
import co.gov.sic.encuesta.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {

  private final PollRepository pollRepository;

  @Autowired
  IPollMapper pollMapper;

  public PollService(PollRepository pollRepository) {
    this.pollRepository = pollRepository;
  }

  public void savePoll(PollDto poll) {
    pollRepository.saveAndFlush(pollMapper.dtoToEntity(poll));
  }

  public List<Poll> findPolls() {
    return pollRepository.findAll();
  }

  public void deletedPoll(Long id){
    pollRepository.deletePollById(id);
  }
}
