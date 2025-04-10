package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "nhom_kien_thuc")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class NhomKienThuc extends BaseModel {
    private String ten;

    @OneToMany(mappedBy = "nhomKienThuc")
    @ToString.Exclude
    private List<KhungChuongTrinhNhomKienThuc> khungChuongTrinhNhomKienThucs;
}
