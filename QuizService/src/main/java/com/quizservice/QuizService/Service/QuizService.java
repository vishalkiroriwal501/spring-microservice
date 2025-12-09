package com.quizservice.QuizService.Service;

import com.quizservice.QuizService.Entity.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> get();
    Quiz get(Long id);
}
