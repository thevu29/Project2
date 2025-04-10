package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "khung_chuong_trinh")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class KhungChuongTrinh extends BaseModel {
    @OneToOne
    @JoinColumn(name = "ctdt_id")
    private ChuongTrinhDaoTao chuongTrinhDaoTao;

    private String ten;

    private String he_dao_tao;

    private String trinh_do;

    private int tong_tin_chi;

    private int thoi_gian_dao_tao;

    @OneToMany(mappedBy = "khungChuongTrinh")
    @ToString.Exclude
    private List<KhungChuongTrinhNhomKienThuc> khungChuongTrinhNhomKienThucs;
}
