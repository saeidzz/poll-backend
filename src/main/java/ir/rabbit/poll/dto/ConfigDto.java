package ir.rabbit.poll.dto;

import lombok.*;

import javax.persistence.*;

/**
 * @author saeid zangeneh
 */


@Getter
@Setter
@AllArgsConstructor
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

    @Override
    public String toString() {
        return "ConfigDto{" +
                "id=" + id +
                ", pollType=" + pollType +
                ", securityLevel=" + securityLevel +
                ", timeLimited=" + timeLimited +
                ", showResultToOther=" + showResultToOther +
                ", comment=" + comment +
                ", selectMultiple=" + selectMultiple +
                ", themeName='" + themeName + '\'' +
                ", chartType='" + chartType + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
