package org.example.project2.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.project2.constant.UserRole;

@Table(name = "user")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"password"})
public class User extends BaseModel {
    private String username;

    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToOne(mappedBy = "user")
    private GiangVien giangVien;
}
