package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "nganh_hoc")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class NganhHoc extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "khoa_id")
    private Khoa khoa;

    private String ten;

    private String mo_ta;

    @OneToMany(mappedBy = "nganhHoc")
    @ToString.Exclude
    private List<ChuongTrinhDaoTao> chuongTrinhDaoTaos;

    @OneToMany(mappedBy = "nganhHoc")
    @ToString.Exclude
    private List<HocPhan> hocPhans;
}
