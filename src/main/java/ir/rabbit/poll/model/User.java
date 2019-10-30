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
public class User {
    private Long id;
    private String name;
    private String lastName;
    private String emailAddress;
    private String password;
    private Date memberShipDate;
    @OneToMany
    private List<Poll> polls;
    @OneToMany
    private List<Like> likes;
    @OneToMany
    private List<Comment> comments;
}
