package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.*;
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
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", owner=" + owner +
                ", question='" + question + '\'' +
                ", options=" + options +
                ", config=" + config +
                ", comments=" + comments +
                '}';
    }
}
