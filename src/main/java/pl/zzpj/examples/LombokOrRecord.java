package pl.zzpj.examples;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
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
}
