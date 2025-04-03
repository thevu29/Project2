package org.example.project2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ctdt_decuongchitiet")
public class DeCuongChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SyllabusID")
    private Long syllabusId;

    @OneToOne
    @JoinColumn(name = "CourseID", nullable = false)
    private HocPhan hocPhan;

    @Column(name = "Objectives", columnDefinition = "TEXT")
    private String objectives;

    @Column(name = "Content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "Assessment", columnDefinition = "TEXT")
    private String assessment;

    @Column(name = "References", columnDefinition = "TEXT")
    private String references;

    // Constructor
    public DeCuongChiTiet() {
    }

    // Getter và Setter
    public Long getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(Long syllabusId) {
        this.syllabusId = syllabusId;
    }

    public HocPhan getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(HocPhan hocPhan) {
        this.hocPhan = hocPhan;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }
}