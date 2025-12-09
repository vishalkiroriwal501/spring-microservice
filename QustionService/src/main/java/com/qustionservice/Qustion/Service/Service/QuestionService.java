package com.qustionservice.Qustion.Service.Service;

import com.qustionservice.Qustion.Service.Entity.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionService {

    Question create(Question question);
    List<Question> get();
    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}