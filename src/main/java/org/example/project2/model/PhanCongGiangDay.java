package org.example.project2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ctdt_phanconggiangday")
public class PhanCongGiangDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AssignmentID")
    private Long assignmentId;

    @ManyToOne
    @JoinColumn(name = "ClassPlanID", nullable = false)
    private KeHoachMoNhom keHoachMonNhom;

    @ManyToOne
    @JoinColumn(name = "InstructorID", nullable = false)
    private GiangVien giangVien;

    @Column(name = "Role")
    private String role;

    // Constructor
    public PhanCongGiangDay() {
    }

    // Getter và Setter
    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public KeHoachMoNhom getKeHoachMonNhom() {
        return keHoachMonNhom;
    }

    public void setKeHoachMonNhom(KeHoachMoNhom keHoachMonNhom) {
        this.keHoachMonNhom = keHoachMonNhom;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}