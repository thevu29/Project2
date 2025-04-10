package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "khung_chuong_trinh_nhom_kien_thuc")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class KhungChuongTrinhNhomKienThuc extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "kct_id")
    private KhungChuongTrinh khungChuongTrinh;

    @ManyToOne
    @JoinColumn(name = "nkt_id")
    private NhomKienThuc nhomKienThuc;

    private int tin_chi_bat_buoc;

    private int tin_chi_tu_chon;
}
