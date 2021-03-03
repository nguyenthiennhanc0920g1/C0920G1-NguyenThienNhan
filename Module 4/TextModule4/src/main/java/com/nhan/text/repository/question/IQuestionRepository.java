package com.nhan.text.repository.question;

import com.nhan.text.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findQuestionByTitleContaining(String q);
}
