
package ir.rabbit.poll.controller.abstraction;

import io.swagger.annotations.*;
import ir.rabbit.poll.dto.LikeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
@Api(value = "like", description = "the like API")
public interface LikeApi {

    @ApiOperation(value = "ایجاد لایک", nickname = "createLike", notes = "", tags={ "like", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "عملیات موفقیت آمیز") })
    @RequestMapping(value = "/like",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createLike(@ApiParam(value = "ساخت لایک", required = true) @Valid @RequestBody LikeDto like);


    @ApiOperation(value = "حذف یک لایک", nickname = "deleteLike", notes = "", tags={ "like", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "شناسه نامعتبر"),
        @ApiResponse(code = 404, message = "لایک مورد نظر یافت نشد") })
    @RequestMapping(value = "/like/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteLike(@ApiParam(value = "شناسه لایکی که باید حذف شود", required = true) @PathVariable("id") Long id);


    @ApiOperation(value = "دریافت یک لایک با شناسه", nickname = "getLikeById", notes = "", response = LikeDto.class, tags={ "like", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = LikeDto.class),
        @ApiResponse(code = 400, message = "شناسه نامعتبر"),
        @ApiResponse(code = 404, message = "لایک یافت نشد") })
    @RequestMapping(value = "/like/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LikeDto> getLikeById(@ApiParam(value = " ", required = true) @PathVariable("id") Long id);

}
