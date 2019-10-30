package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
public class Poll {
    private Long id;
    @OneToOne
    private User owner;
    private String question;
    @OneToMany
    private List<Option> options;
    @OneToOne
    private Config config;
    @OneToMany
    private List<Comment> comments;
}
