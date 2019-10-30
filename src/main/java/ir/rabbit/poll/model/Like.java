package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
public class Like {
    private Long id;
    @ManyToOne
    private Comment comment;
    @OneToOne
    private User liker;
    private Date date;
}
