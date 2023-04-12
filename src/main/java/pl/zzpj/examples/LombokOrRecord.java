package pl.zzpj.examples;

import java.time.LocalDate;
import java.util.Objects;

public class LombokOrRecord {

    private Long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String occupation;

    private Double salary;
    private String academicTitle;
    private String gender;
    private String login;
    private String email;
    private String password;
    private String securityNumber;
    private String securityQuestion;
    private String securityAnswer;
    private Integer status;
    private String additionalField1;
    private String additionalField2;
    private String additionalField3;
    private String additionalField4;
    private String additionalField5;

    public LombokOrRecord() {
    }

    public LombokOrRecord(Long id, String name, String surname, LocalDate birthDate, String occupation, Double salary, String academicTitle, String gender, String login, String email, String password, String securityNumber, String securityQuestion, String securityAnswer, Integer status, String additionalField1, String additionalField2, String additionalField3, String additionalField4, String additionalField5) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.occupation = occupation;
        this.salary = salary;
        this.academicTitle = academicTitle;
        this.gender = gender;
        this.login = login;
        this.email = email;
        this.password = password;
        this.securityNumber = securityNumber;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.status = status;
        this.additionalField1 = additionalField1;
        this.additionalField2 = additionalField2;
        this.additionalField3 = additionalField3;
        this.additionalField4 = additionalField4;
        this.additionalField5 = additionalField5;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAdditionalField1() {
        return additionalField1;
    }

    public void setAdditionalField1(String additionalField1) {
        this.additionalField1 = additionalField1;
    }

    public String getAdditionalField2() {
        return additionalField2;
    }

    public void setAdditionalField2(String additionalField2) {
        this.additionalField2 = additionalField2;
    }

    public String getAdditionalField3() {
        return additionalField3;
    }

    public void setAdditionalField3(String additionalField3) {
        this.additionalField3 = additionalField3;
    }

    public String getAdditionalField4() {
        return additionalField4;
    }

    public void setAdditionalField4(String additionalField4) {
        this.additionalField4 = additionalField4;
    }

    public String getAdditionalField5() {
        return additionalField5;
    }

    public void setAdditionalField5(String additionalField5) {
        this.additionalField5 = additionalField5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LombokOrRecord that = (LombokOrRecord) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(surname, that.surname)) return false;
        if (!Objects.equals(birthDate, that.birthDate)) return false;
        if (!Objects.equals(occupation, that.occupation)) return false;
        if (!Objects.equals(salary, that.salary)) return false;
        if (!Objects.equals(academicTitle, that.academicTitle))
            return false;
        if (!Objects.equals(gender, that.gender)) return false;
        if (!Objects.equals(login, that.login)) return false;
        if (!Objects.equals(email, that.email)) return false;
        if (!Objects.equals(password, that.password)) return false;
        if (!Objects.equals(securityNumber, that.securityNumber))
            return false;
        if (!Objects.equals(securityQuestion, that.securityQuestion))
            return false;
        if (!Objects.equals(securityAnswer, that.securityAnswer))
            return false;
        if (!Objects.equals(status, that.status)) return false;
        if (!Objects.equals(additionalField1, that.additionalField1))
            return false;
        if (!Objects.equals(additionalField2, that.additionalField2))
            return false;
        if (!Objects.equals(additionalField3, that.additionalField3))
            return false;
        if (!Objects.equals(additionalField4, that.additionalField4))
            return false;
        return Objects.equals(additionalField5, that.additionalField5);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (academicTitle != null ? academicTitle.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (securityNumber != null ? securityNumber.hashCode() : 0);
        result = 31 * result + (securityQuestion != null ? securityQuestion.hashCode() : 0);
        result = 31 * result + (securityAnswer != null ? securityAnswer.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (additionalField1 != null ? additionalField1.hashCode() : 0);
        result = 31 * result + (additionalField2 != null ? additionalField2.hashCode() : 0);
        result = 31 * result + (additionalField3 != null ? additionalField3.hashCode() : 0);
        result = 31 * result + (additionalField4 != null ? additionalField4.hashCode() : 0);
        result = 31 * result + (additionalField5 != null ? additionalField5.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LombokOrRecord{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", occupation='").append(occupation).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", academicTitle='").append(academicTitle).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", securityNumber='").append(securityNumber).append('\'');
        sb.append(", securityQuestion='").append(securityQuestion).append('\'');
        sb.append(", secutiryAnswer='").append(securityAnswer).append('\'');
        sb.append(", status=").append(status);
        sb.append(", additionalField1='").append(additionalField1).append('\'');
        sb.append(", additionalField2='").append(additionalField2).append('\'');
        sb.append(", additionalField3='").append(additionalField3).append('\'');
        sb.append(", additionalField4='").append(additionalField4).append('\'');
        sb.append(", additionalField5='").append(additionalField5).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
