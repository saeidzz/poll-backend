package ir.rabbit.poll.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
public class Config {
    private Long id;
    @Enumerated
    private PollType pollType;
    @Enumerated
    private SecurityLevel securityLevel;
    private Boolean timeLimited;
    private Boolean showResultToOther;
    private Boolean comment;
    private Boolean selectMultiple;
    private String themeName;
    private String chartType;
    private String password;
}
