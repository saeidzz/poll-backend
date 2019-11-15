package ir.rabbit.poll.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import ir.rabbit.poll.controller.abstraction.VoteApi;
import ir.rabbit.poll.model.VoteDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Controller
@Api(tags = "vote")
public class VoteApiController implements VoteApi {

    private static final Logger log = LoggerFactory.getLogger(VoteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public VoteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createVote(@ApiParam(value = "رأی", required = true) @Valid @RequestBody VoteDto vote) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VoteDto> getVoteById(@ApiParam(value = " ", required = true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VoteDto>(objectMapper.readValue("{ }", VoteDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VoteDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VoteDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<VoteDto>> getVotesByPollId(@ApiParam(value = "شناسه نظز سنجی ", required = true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<VoteDto>>(objectMapper.readValue("[ { }, { } ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<VoteDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<VoteDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<VoteDto>> getVotesByUserId(@ApiParam(value = "شناسه شخص رأی دهنده", required = true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<VoteDto>>(objectMapper.readValue("[ { }, { } ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<VoteDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<VoteDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateVote(@ApiParam(value = " شناسه نظرسنجی که باید به روز رسانی شود", required = true) @PathVariable("id") Long id, @ApiParam(value = "", required = true) @Valid @RequestBody VoteDto poll) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
