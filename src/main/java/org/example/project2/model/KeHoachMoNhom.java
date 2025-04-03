package org.example.project2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ctdt_kehoachmonhom")
public class KeHoachMoNhom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClassPlanID")
    private Long classPlanId;

    @ManyToOne
    @JoinColumn(name = "CourseID", nullable = false)
    private HocPhan hocPhan;

    @ManyToOne
    @JoinColumn(name = "TeachingPlanID", nullable = false)
    private KeHoachDayHoc keHoachDayHoc;

    @Column(name = "ClassCode", unique = true)
    private String classCode;

    @Column(name = "MaxStudents")
    private Integer maxStudents;

    @Column(name = "Schedule", columnDefinition = "TEXT")
    private String schedule;

    @OneToMany(mappedBy = "keHoachMonNhom", cascade = CascadeType.ALL)
    private List<PhanCongGiangDay> phanCongGiangDays;

    // Constructor
    public KeHoachMoNhom() {
    }

    // Getter và Setter
    public Long getClassPlanId() {
        return classPlanId;
    }

    public void setClassPlanId(Long classPlanId) {
        this.classPlanId = classPlanId;
    }

    public HocPhan getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(HocPhan hocPhan) {
        this.hocPhan = hocPhan;
    }

    public KeHoachDayHoc getKeHoachDayHoc() {
        return keHoachDayHoc;
    }

    public void setKeHoachDayHoc(KeHoachDayHoc keHoachDayHoc) {
        this.keHoachDayHoc = keHoachDayHoc;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public Integer getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(Integer maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public List<PhanCongGiangDay> getPhanCongGiangDays() {
        return phanCongGiangDays;
    }

    public void setPhanCongGiangDays(List<PhanCongGiangDay> phanCongGiangDays) {
        this.phanCongGiangDays = phanCongGiangDays;
    }
}