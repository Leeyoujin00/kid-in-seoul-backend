package app.kidsInSeoul.facility.repository;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@DiscriminatorValue("art_gallery_edu")
public class ArtGalleryEdu extends Facility {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "art_gallery_edu_id")
    private Long id;
    private String target;
    private String eduSpot;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDate eduStart;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDate eduEnd;
    private LocalDate content;
    private String eduLimit;
    private String url;
    private String eduFee;
    private LocalDate recruitStart;
    private LocalDate recruitEnd;
}
