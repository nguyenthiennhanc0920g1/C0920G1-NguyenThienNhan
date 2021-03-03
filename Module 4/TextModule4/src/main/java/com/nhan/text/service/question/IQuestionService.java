package com.nhan.text.service.question;

import com.nhan.text.model.Question;

import java.util.List;

public interface IQuestionService {
    List<Question> findAll();
    void deleteById(int id);
    List<Question> search(String q);
}
