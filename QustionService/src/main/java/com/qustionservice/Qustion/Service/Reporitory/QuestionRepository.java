package com.qustionservice.Qustion.Service.Reporitory;

import com.qustionservice.Qustion.Service.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuizId(Long quizId);
}
