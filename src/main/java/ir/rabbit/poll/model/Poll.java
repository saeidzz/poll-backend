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
@ToString
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
}
