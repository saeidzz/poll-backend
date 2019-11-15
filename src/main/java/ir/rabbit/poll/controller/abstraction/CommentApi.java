
package ir.rabbit.poll.controller.abstraction;

import io.swagger.annotations.*;
import ir.rabbit.poll.dto.CommentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
public interface CommentApi {

    @ApiOperation(value = "ساخت یک نظر ", nickname = "createComment", notes = "", tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "عملیات موفقیت آمیز") })
    @RequestMapping(value = "/comment",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createComment(@ApiParam(value = "", required = true) @Valid @RequestBody CommentDto comment);


    @ApiOperation(value = "حذف یک نظر", nickname = "deleteComment", notes = "", tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "شناسه نامعتبر"),
        @ApiResponse(code = 404, message = "نظر مورد نظر یافت نشد") })
    @RequestMapping(value = "/comment/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteComment(@ApiParam(value = "شناسه نظری که باید حذف شود", required = true) @PathVariable("id") Long id);


    @ApiOperation(value = "دریافت یک نظر با شناسه", nickname = "getCommentById", notes = "دریافت یک نظر با شناسه یکتا", response = CommentDto.class, tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = CommentDto.class),
        @ApiResponse(code = 400, message = "شناسه نامعتبر"),
        @ApiResponse(code = 404, message = "نظر مورد  نظر یافت نشد") })
    @RequestMapping(value = "/comment/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CommentDto> getCommentById(@ApiParam(value = "شناسه", required = true) @PathVariable("id") Long id);


    @ApiOperation(value = "بروز رسانی یک نظر", nickname = "updateComment", notes = "", tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "شناسه نامعتبر"),
        @ApiResponse(code = 404, message = "نظر مورد نظر یافت نشد") })
    @RequestMapping(value = "/comment/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateComment(@ApiParam(value = "شناسه نظری که باید به بروز رسانی شود", required = true) @PathVariable("id") Long id, @ApiParam(value = "", required = true) @Valid @RequestBody CommentDto comment);

}
