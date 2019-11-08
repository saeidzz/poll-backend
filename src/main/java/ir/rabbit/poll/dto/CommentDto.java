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
@ToString
@NoArgsConstructor
public class CommentDto {
    private Long id;
    private String content;
    private UserDto commenter;
    private PollDto poll;
    private List<LikeDto> likeDtos;
    private Date date;


}
