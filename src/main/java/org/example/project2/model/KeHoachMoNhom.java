package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Table(name = "ke_hoach_mo_nhom")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class KeHoachMoNhom extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "hoc_phan_id")
    private HocPhan hocPhan;

    private int nam_hoc;

    private int hoc_ky;

    private int so_luong;

    @Temporal(TemporalType.DATE)
    private LocalDate thoi_gian_bat_dau;

    @Temporal(TemporalType.DATE)
    private LocalDate thoi_gian_ket_thuc;

    @OneToMany(mappedBy = "keHoachMoNhom")
    @ToString.Exclude
    private List<PhanCongGiangDay> phanCongGiangDays;
}
