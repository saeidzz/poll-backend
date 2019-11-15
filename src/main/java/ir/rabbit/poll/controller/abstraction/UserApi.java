
package ir.rabbit.poll.controller.abstraction;

import io.swagger.annotations.*;
import ir.rabbit.poll.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "اضافه نمودن یک کاربر", nickname = "createUser", notes = "", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز")})
    @RequestMapping(value = "/user",
            produces = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> createUser(@ApiParam(value = "کاربر مورد نظر", required = true) @Valid @RequestBody UserDto user);


    @ApiOperation(value = "حذف یک کاربر", nickname = "deleteUser", notes = "", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "نام کاربری نامعتبر"),
            @ApiResponse(code = 404, message = "کاربر مورد نظر یافت نشد")})
    @RequestMapping(value = "/user/{username}",
            produces = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@ApiParam(value = "", required = true) @PathVariable("username") String username);


    @ApiOperation(value = "دریافت یک کاربر با نام کاربری ", nickname = "getUserByName", notes = "", response = UserDto.class, tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = UserDto.class),
            @ApiResponse(code = 400, message = "نام کاربری معتبر نمی باشد"),
            @ApiResponse(code = 404, message = "کاربر یافت نشد")})
    @RequestMapping(value = "/user/{username}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<UserDto> getUserByName(@ApiParam(value = "نام کاربری که اطلاعات آن از سامانه باید دریافت شود ", required = true) @PathVariable("username") String username);


    @ApiOperation(value = "کاربر وارد سامانه میشود", nickname = "loginUser", notes = "", response = String.class, tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز", response = String.class),
            @ApiResponse(code = 400, message = "نام کاربری و رمز عبور نامعتبر است ")})
    @RequestMapping(value = "/user/login",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "نام کاربری کاربری که میخواهد وارد سامانه شود", required = true) @Valid @RequestParam(value = "username", required = true) String username, @NotNull @ApiParam(value = "رمز عبور کاربری که میخواهد وارد سامانه شود", required = true) @Valid @RequestParam(value = "password", required = true) String password);


    @ApiOperation(value = "خروج کاربری که اکنون در سامانه ورود کرده است", nickname = "logoutUser", notes = "", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "عملیات موفقیت آمیز")})
    @RequestMapping(value = "/user/logout",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser();


    @ApiOperation(value = "به روز رسانی کاربر", nickname = "updateUser", notes = "", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "نام کاربری نامعتبر"),
            @ApiResponse(code = 404, message = "کاربر یافت نشد")})
    @RequestMapping(value = "/user/{username}",
            produces = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@ApiParam(value = "نام کاربری که باید به روز رسانی شود", required = true) @PathVariable("username") String username, @ApiParam(value = "", required = true) @Valid @RequestBody UserDto user);

}
