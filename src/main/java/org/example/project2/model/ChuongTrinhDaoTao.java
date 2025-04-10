package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "chuong_trinh_dao_tao")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class ChuongTrinhDaoTao extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "nganh_hoc_id")
    private NganhHoc nganhHoc;

    private String ten;

    private String he_dao_tao;

    private String trinh_do;

    private int tong_tin_chi;

    private int thoi_gian_dao_tao;

    @OneToOne(mappedBy = "chuongTrinhDaoTao")
    private KhungChuongTrinh khungChuongTrinh;
}
