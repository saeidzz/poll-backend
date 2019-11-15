package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.*;

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
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String content;
    private String image;
    @OneToOne
    private Poll poll;

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", poll=" + poll +
                '}';
    }
}
