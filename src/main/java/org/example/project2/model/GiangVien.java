package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "giang_vien")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class GiangVien extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "khoa_id")
    private Khoa khoa;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String ho_ten;

    private String trinh_do;

    private String chuyen_mon;

    @OneToMany(mappedBy = "giangVien")
    @ToString.Exclude
    private List<PhanCongGiangDay> phanCongGiangDays;
}
