package ir.rabbit.poll.dto;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author saeid zangeneh
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class PollDto {
    private Long id;
    private UserDto owner;
    private String question;
    private List<String> options;
    private ConfigDto configDto;
    private List<CommentDto> commentDtos;
}
