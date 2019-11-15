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
public class CommentDto {
    private Long id;
    private String content;
    private UserDto commenter;
    private PollDto poll;
    private List<LikeDto> likeDtos;
    private Date date;

    @Override
    public String toString() {
        return "CommentDto{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", commenter=" + commenter +
                ", poll=" + poll +
                ", likeDtos=" + likeDtos +
                ", date=" + date +
                '}';
    }
}
