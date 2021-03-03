package com.nhan.text.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "question_type")
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_type_id")
    private int idQuestionType;

    @Column(name = "question_type_name")
    @NotNull(message = "Tên loại câu hỏi không được để trống")
    @Size(min = 5, max = 100, message = "Tên phải từ 5 đến 100 ký tự")
    private String nameQuestionType;

    @OneToMany(mappedBy = "questionType")
    private Set<Question> questionSet;

    public QuestionType() {
    }

    public int getIdQuestionType() {
        return idQuestionType;
    }

    public void setIdQuestionType(int idQuestionType) {
        this.idQuestionType = idQuestionType;
    }

    public String getNameQuestionType() {
        return nameQuestionType;
    }

    public void setNameQuestionType(String nameQuestionType) {
        this.nameQuestionType = nameQuestionType;
    }

    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(Set<Question> questionSet) {
        this.questionSet = questionSet;
    }
}
