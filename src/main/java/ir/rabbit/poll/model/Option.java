package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
public class Option {
    private Long id;
    private String content;
    private String image;
    @OneToOne
    private Poll poll;
}
