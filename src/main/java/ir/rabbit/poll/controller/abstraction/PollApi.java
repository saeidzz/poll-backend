
package ir.rabbit.poll.controller.abstraction;

import io.swagger.annotations.*;
import ir.rabbit.poll.dto.PollDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "poll", description = "the poll API")
public interface PollApi {

    @ApiOperation(value = "ساخت یک نظرسنجی", nickname = "createPoll", notes = "", tags = {"poll",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز")})
    @RequestMapping(value = "/poll",
            produces = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> createPoll(@ApiParam(value = "ساخت یک نظر سنجی", required = true) @Valid @RequestBody PollDto poll);


    @ApiOperation(value = "حذف یک نظرسنجی", nickname = "deletePoll", notes = "", tags = {"poll",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "شناسه نامعتبر"),
            @ApiResponse(code = 404, message = "نظرسنجی مورد نظر یافت نشد")})
    @RequestMapping(value = "/poll/{id}",
            produces = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePoll(@ApiParam(value = "", required = true) @PathVariable("id") Long id);


    @ApiOperation(value = "دریافت یک نظر سنجی با شناسه", nickname = "getPollById", notes = "", response = PollDto.class, tags = {"poll",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = PollDto.class),
            @ApiResponse(code = 400, message = "شناسه نامعتبر"),
            @ApiResponse(code = 404, message = "نظر سنجی یافت  نشد")})
    @RequestMapping(value = "/poll/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<PollDto> getPollById(@ApiParam(value = "", required = true) @PathVariable("id") Long id);


    @ApiOperation(value = "به روز رسانی یک نظرسنجی", nickname = "updatePoll", notes = "", tags = {"poll",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "شناسه نامعتبر"),
            @ApiResponse(code = 404, message = "نظرسنجی یافت نشد")})
    @RequestMapping(value = "/poll/{id}",
            produces = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Void> updatePoll(@ApiParam(value = " شناسه نظرسنجی که باید به روز رسانی شود", required = true) @PathVariable("id") Long id, @ApiParam(value = "", required = true) @Valid @RequestBody PollDto poll);

}
