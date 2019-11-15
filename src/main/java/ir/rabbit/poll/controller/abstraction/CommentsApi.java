
package ir.rabbit.poll.controller.abstraction;

import io.swagger.annotations.*;
import ir.rabbit.poll.dto.CommentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Api(value = "comments", description = "the comments API")
public interface CommentsApi {

    @ApiOperation(value = "دریافت نظرات مربوط به یک نظرسنجی", nickname = "getCommentsByPollId", notes = "", response = CommentDto.class, responseContainer = "List", tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = CommentDto.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "شناسه نامعتبر"),
        @ApiResponse(code = 404, message = "نظر مورد  نظر یافت نشد") })
    @RequestMapping(value = "/comments/poll/{pollId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<CommentDto>> getCommentsByPollId(@ApiParam(value = "شناسه نظر مورد نظر", required = true) @PathVariable("pollId") Long pollId);


    @ApiOperation(value = "دریافت نظرات یک شخص با شناسه شخص", nickname = "getCommentsByUserId", notes = "", response = CommentDto.class, responseContainer = "List", tags={ "comment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = CommentDto.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "شناسه نامعتبر"),
        @ApiResponse(code = 404, message = "نظر مورد  نظر یافت نشد") })
    @RequestMapping(value = "/comments/user/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<CommentDto>> getCommentsByUserId(@ApiParam(value = "شناسه نظر مورد نظر", required = true) @PathVariable("userId") Long userId);

}
