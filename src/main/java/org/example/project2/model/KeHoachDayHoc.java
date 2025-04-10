package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "ke_hoach_day_hoc")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class KeHoachDayHoc extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "hoc_phan_id")
    private HocPhan hocPhan;

    private int hoc_ky;

    private int nam_hoc;
}
