package app.kidsInSeoul.schedule.web.dto.request;
import app.kidsInSeoul.facility.repository.*;
import app.kidsInSeoul.member.repository.Member;
import app.kidsInSeoul.schedule.repository.Schedule;
import jakarta.validation.constraints.Max;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@NoArgsConstructor
public class ScheduleSaveRequestDto {

    private String title;

    private String content;

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Member member;


    private int isWithChild;

    private String type;

    private Long facilityId;

    @Builder
    public ScheduleSaveRequestDto(String title, String content, LocalDate date, LocalTime startTime, LocalTime endTime, int isWithChild, Member member, String type, Long facilityId){
        this.title = title;
        this.content = content;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.member = member;
        this.isWithChild = isWithChild;
        this.facilityId = facilityId;
        this.type = type;

    }


    public Schedule toEntity(Member member, Facility facility) {
        return Schedule.builder()
                .title(title)
                .content(content)
                .date(date)
                .startTime(startTime)
                .endTime(endTime)
                .member(member)
                .facility(facility)
                .isWithChild(isWithChild)
                .type(type)
                .build();
    }

}
