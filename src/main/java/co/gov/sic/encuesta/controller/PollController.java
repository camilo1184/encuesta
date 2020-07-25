package co.gov.sic.encuesta.controller;

import co.gov.sic.encuesta.delegate.PollDelegate;
import co.gov.sic.encuesta.dto.PollDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/poll")
public class PollController {

  @Autowired
  PollDelegate pollDelegate;

  @PostMapping
  public ResponseEntity savePoll(@RequestBody PollDto poll) {
    return pollDelegate.savePoll(poll);
  }

  @GetMapping
  public ResponseEntity findPolls() {
    return pollDelegate.findPolls();
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity deletedPoll(@PathVariable("id") Long id) {
    return pollDelegate.deletedPoll(id);
  }
}
