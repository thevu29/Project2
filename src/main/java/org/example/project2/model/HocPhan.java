package org.example.project2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ctdt_hocphan")
public class HocPhan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CourseID")
    private Long courseId;

    @ManyToOne
    @JoinColumn(name = "FrameworkID", nullable = false)
    private KhungChuongTrinh khungChuongTrinh;

    @Column(name = "CourseCode", unique = true)
    private String courseCode;

    @Column(name = "CourseName", nullable = false)
    private String courseName;

    @Column(name = "Credits")
    private Integer credits;

    @Column(name = "CourseType")
    private String courseType;

    @OneToOne(mappedBy = "hocPhan", cascade = CascadeType.ALL)
    private DeCuongChiTiet deCuongChiTiet;

    @OneToMany(mappedBy = "hocPhan", cascade = CascadeType.ALL)
    private List<KeHoachMoNhom> keHoachMoNhoms;

    // Constructor
    public HocPhan() {
    }

    // Getter và Setter
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public KhungChuongTrinh getKhungChuongTrinh() {
        return khungChuongTrinh;
    }

    public void setKhungChuongTrinh(KhungChuongTrinh khungChuongTrinh) {
        this.khungChuongTrinh = khungChuongTrinh;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public DeCuongChiTiet getDeCuongChiTiet() {
        return deCuongChiTiet;
    }

    public void setDeCuongChiTiet(DeCuongChiTiet deCuongChiTiet) {
        this.deCuongChiTiet = deCuongChiTiet;
    }

    public List<KeHoachMoNhom> getKeHoachMoNhoms() {
        return keHoachMoNhoms;
    }

    public void setKeHoachMonNhoms(List<KeHoachMoNhom> keHoachMoNhoms) {
        this.keHoachMoNhoms = keHoachMoNhoms;
    }
}