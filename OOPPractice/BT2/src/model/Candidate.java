/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Candidate {

    private String code;
    private String name;
    private String dob; // Ngày tháng năm sinh
    private float mathScore; // Điểm Toán
    private float literatureScore; // Điểm Văn
    private float englishScore; // Điểm Anh

    public Candidate(String code, String name, String dob, float mathScore, float literatureScore, float englishScore) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getLiteratureScore() {
        return literatureScore;
    }

    public void setLiteratureScore(float literatureScore) {
        this.literatureScore = literatureScore;
    }

    public float getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(float englishScore) {
        this.englishScore = englishScore;
    }

    // Tính tổng điểm của thí sinh
    public float getTotalScore() {
        return mathScore + literatureScore + englishScore;
    }

    // Phương thức toString() để hiển thị thông tin của thí sinh
    @Override
    public String toString() {
        return "Candidate code: " + code
                + ", Name: " + name
                + ", Date of birth: " + dob
                + ", Math score: " + mathScore
                + ", Literature score: " + literatureScore
                + ", English score: " + englishScore;
    }
}
