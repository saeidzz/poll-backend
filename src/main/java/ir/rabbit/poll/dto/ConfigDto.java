package ir.rabbit.poll.dto;

import lombok.*;

import javax.persistence.*;

/**
 * @author saeid zangeneh
 */


@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class ConfigDto {
    private Long id;
    private PollType pollType;
    private SecurityLevel securityLevel;
    private Boolean timeLimited;
    private Boolean showResultToOther;
    private Boolean comment;
    private Boolean selectMultiple;
    private String themeName;
    private String chartType;
    private String password;
}
