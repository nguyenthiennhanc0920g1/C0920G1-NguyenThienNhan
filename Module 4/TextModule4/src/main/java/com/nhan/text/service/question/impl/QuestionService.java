package com.nhan.text.service.question.impl;

import com.nhan.text.model.Question;
import com.nhan.text.repository.question.IQuestionRepository;
import com.nhan.text.service.question.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
    IQuestionRepository iQuestionRepository;
    @Override
    public List<Question> findAll() {
        return iQuestionRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        iQuestionRepository.deleteById(id);
    }

    @Override
    public List<Question> search(String q) {
        return iQuestionRepository.findQuestionByTitleContaining(q);
    }
}
