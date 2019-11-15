package ir.rabbit.poll.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author saeid zangeneh
 */

@Getter
@Setter
@AllArgsConstructor

@NoArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String lastName;
    private String emailAddress;
    private String password;
    private Date memberShipDate;
    private List<PollDto> polls;
    private List<LikeDto> likeDtos;
    private List<CommentDto> commentDtos;

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", memberShipDate=" + memberShipDate +
                ", polls=" + polls +
                ", likeDtos=" + likeDtos +
                ", commentDtos=" + commentDtos +
                '}';
    }
}
