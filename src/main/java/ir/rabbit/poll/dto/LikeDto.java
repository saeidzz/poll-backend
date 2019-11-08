package ir.rabbit.poll.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * @author saeid zangeneh
 */


@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class LikeDto {
    private Long id;
    private CommentDto commentDto;
    private UserDto liker;
    private Date date;
}
