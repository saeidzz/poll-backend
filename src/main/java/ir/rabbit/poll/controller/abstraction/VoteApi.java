
package ir.rabbit.poll.controller.abstraction;

import io.swagger.annotations.*;
import ir.rabbit.poll.model.VoteDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Api(value = "vote", description = "the vote API")
public interface VoteApi {

    @ApiOperation(value = "اضافه نمودن یک رأی", nickname = "createVote", notes = "", tags = {"vote",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز")})
    @RequestMapping(value = "/vote",
            produces = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> createVote(@ApiParam(value = "رأی", required = true) @Valid @RequestBody VoteDto vote);


    @ApiOperation(value = "دریافت یک رأی", nickname = "getVoteById", notes = "", response = VoteDto.class, tags = {"vote",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = VoteDto.class),
            @ApiResponse(code = 400, message = "شناسه نامعتبر"),
            @ApiResponse(code = 404, message = "یافت نشد")})
    @RequestMapping(value = "/vote/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<VoteDto> getVoteById(@ApiParam(value = " ", required = true) @PathVariable("id") Long id);


    @ApiOperation(value = "دریافت رأی های یک نظرسنجی", nickname = "getVotesByPollId", notes = "", response = VoteDto.class, responseContainer = "List", tags = {"vote",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = VoteDto.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "شناسه نامعتبر"),
            @ApiResponse(code = 404, message = "یافت نشد")})
    @RequestMapping(value = "/vote/poll/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<VoteDto>> getVotesByPollId(@ApiParam(value = "شناسه نظز سنجی ", required = true) @PathVariable("id") Long id);


    @ApiOperation(value = "دریافت رأی های یک شخص", nickname = "getVotesByUserId", notes = "", response = VoteDto.class, responseContainer = "List", tags = {"vote",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = VoteDto.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "شناسه نامعتبر"),
            @ApiResponse(code = 404, message = "یافت نشد")})
    @RequestMapping(value = "/vote/user/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<VoteDto>> getVotesByUserId(@ApiParam(value = "شناسه شخص رأی دهنده", required = true) @PathVariable("id") Long id);


    @ApiOperation(value = "به روز رسانی یک رأی", nickname = "updateVote", notes = "", tags = {"vote",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "شناسه نامعتبر"),
            @ApiResponse(code = 404, message = " یافت نشد")})
    @RequestMapping(value = "/vote/{id}",
            produces = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Void> updateVote(@ApiParam(value = " شناسه نظرسنجی که باید به روز رسانی شود", required = true) @PathVariable("id") Long id, @ApiParam(value = "", required = true) @Valid @RequestBody VoteDto poll);

}
