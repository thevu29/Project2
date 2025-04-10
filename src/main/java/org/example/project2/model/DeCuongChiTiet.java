package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "de_cuong_chi_tiet")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class DeCuongChiTiet extends BaseModel {
    @OneToOne
    @JoinColumn(name = "hoc_phan_id")
    private HocPhan hocPhan;

    private String muc_tieu;

    private String noi_dung;

    private String phuong_phap_gian_day;

    private String phuong_phap_danh_gia;

    private String tai_lieu_tham_khao;

    @OneToMany(mappedBy = "deCuongChiTiet")
    @ToString.Exclude
    private List<CotDiem> cotDiems;
}
