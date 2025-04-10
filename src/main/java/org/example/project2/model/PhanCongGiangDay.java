package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "phan_cong_giang_day")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class PhanCongGiangDay extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "nhom_id")
    private KeHoachMoNhom keHoachMoNhom;

    @ManyToOne
    @JoinColumn(name = "giang_vien_id")
    private GiangVien giangVien;

    private int so_tiet;
}
