package com.nhan.text.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int idUser;

    @Column(name = "username")
    @NotNull(message = "Username không được để trống")
    @Size(min = 5, max = 100, message = "Tên phải từ 5 đến 100 ký tự")
    private String username;

    @OneToMany(mappedBy = "userCreate")
    private Set<Question> questionCreateSet;

    @OneToMany(mappedBy = "userFeedback")
    private Set<Question> questionFeedbackSet;

    public User() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Question> getQuestionCreateSet() {
        return questionCreateSet;
    }

    public void setQuestionCreateSet(Set<Question> questionCreateSet) {
        this.questionCreateSet = questionCreateSet;
    }

    public Set<Question> getQuestionFeedbackSet() {
        return questionFeedbackSet;
    }

    public void setQuestionFeedbackSet(Set<Question> questionFeedbackSet) {
        this.questionFeedbackSet = questionFeedbackSet;
    }
}
