package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

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
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Comment comment;
    @OneToOne
    private User liker;
    private Date date;
}
