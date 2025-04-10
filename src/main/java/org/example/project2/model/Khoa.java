package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "khoa")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class Khoa extends BaseModel {
    private String ten;

    private String mo_ta;

    @OneToMany(mappedBy = "khoa")
    @ToString.Exclude
    private List<GiangVien> giangViens;

    @OneToMany(mappedBy = "khoa")
    @ToString.Exclude
    private List<NganhHoc> nganhHocs;
}
