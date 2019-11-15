
package ir.rabbit.poll.controller.abstraction;

import io.swagger.annotations.*;
import ir.rabbit.poll.dto.PollDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Api(value = "polls", description = "the polls API")
public interface PollsApi {

    @ApiOperation(value = "دریافت نظرسنجی های یک شخص با شناسه فرد", nickname = "getPollsByUserId", notes = "", response = PollDto.class, responseContainer = "List", tags={ "poll", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = PollDto.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "شناسه نامعتبر"),
        @ApiResponse(code = 404, message = "کاربر رورد نظر یافت نشد") })
    @RequestMapping(value = "/polls/user/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PollDto>> getPollsByUserId(@ApiParam(value = "شناسه نظر مورد نظر", required = true) @PathVariable("userId") Long userId);

}
