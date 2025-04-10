package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cot_diem")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString()
public class CotDiem extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "de_cuong_id")
    private DeCuongChiTiet deCuongChiTiet;

    private String ten;

    private String mo_ta;
}
