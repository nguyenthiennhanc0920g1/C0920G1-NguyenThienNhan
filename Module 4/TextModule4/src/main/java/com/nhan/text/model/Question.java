package com.nhan.text.model;

import com.nhan.text.anotation.CheckAge;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private int idQuestion;

    @Column(name = "title")
    @NotNull(message = "Tiêu đề câu hỏi không được để trống")
    @Size(min = 5, max = 100, message = "Tiêu đề phải từ 5 đến 100 ký tự")
    private String title;

    @Column(name = "question")
    @NotNull(message = "Nội dung câu hỏi không được để trống")
    @Size(min = 10, max = 500, message = "Nội dung câu hỏi phải từ 10 đến 500 ký tự")
    private String question;

    @Column(name = "answer")
    @NotNull(message = "Nội dung câu trả lời không được để trống")
    @Size(min = 10, max = 500, message = "Nội dung câu trả lời phải từ 10 đến 500 ký tự")
    private String answer;

    @Column(name = "date_create")
    @NotNull(message = "Ngày tạo không được để rỗng")
    @CheckAge
    private String dateCreate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "question_type_id", referencedColumnName = "question_type_id")
    @NotNull(message = "Loại câu hỏi không được để rỗng")
    private QuestionType questionType;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    @NotNull(message = "Người tạo câu hỏi không được để rỗng")
    private User userCreate;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User userFeedback;

    public Question() {
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public User getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(User userCreate) {
        this.userCreate = userCreate;
    }

    public User getUserFeedback() {
        return userFeedback;
    }

    public void setUserFeedback(User userFeedback) {
        this.userFeedback = userFeedback;
    }
}
