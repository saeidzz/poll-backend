package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * @author saeid zangeneh
 */
@Entity
@Table
@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Comment {
    private Long id;
    private String content;
    private User commenter;
    private Poll poll;
    @OneToMany
    private List<Like> likes;
    private Date date;


}
