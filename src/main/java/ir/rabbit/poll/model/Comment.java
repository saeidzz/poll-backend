package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.*;
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
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String content;
    @OneToOne
    private User commenter;
    @ManyToOne
    private Poll poll;
    @OneToMany
    private List<Like> likes;
    private Date date;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", commenter=" + commenter +
                ", poll=" + poll +
                ", date=" + date +
                '}';
    }


}
