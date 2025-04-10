package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "hoc_phan")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class HocPhan extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "nganh_hoc_id")
    private NganhHoc nganhHoc;

    private String ten;

    private int tin_chi;

    private int tiet_ly_thuyet;

    private int tiet_thuc_hanh;

    @OneToMany(mappedBy = "hocPhan")
    @ToString.Exclude
    private List<KeHoachDayHoc> keHoachDayHocs;

    @OneToMany(mappedBy = "hocPhan")
    @ToString.Exclude
    private List<KeHoachMoNhom> keHoachMoNhoms;

    @OneToOne(mappedBy = "hocPhan")
    private DeCuongChiTiet deCuongChiTiet;
}
