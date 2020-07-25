package co.gov.sic.encuesta.delegate;

import co.gov.sic.encuesta.dto.PollDto;
import co.gov.sic.encuesta.service.PollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PollDelegate {

  private final PollService pollService;

  public PollDelegate(PollService pollService) {
    this.pollService = pollService;
  }

  public ResponseEntity savePoll(PollDto poll) {
    pollService.savePoll(poll);
    return new ResponseEntity(HttpStatus.OK);
  }

  public ResponseEntity findPolls() {
    return new ResponseEntity(pollService.findPolls(), HttpStatus.OK);
  }

  public ResponseEntity deletedPoll(Long id) {
    pollService.deletedPoll(id);
    return new ResponseEntity(pollService.findPolls(), HttpStatus.OK);
  }
}
