package com.quizservice.QuizService.Reporitory;

import com.quizservice.QuizService.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {




}
