package com.quizservice.QuizService.ServiceImpl;

import com.quizservice.QuizService.Entity.Quiz;
import com.quizservice.QuizService.Reporitory.QuizRepository;
import com.quizservice.QuizService.Service.QuizService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;
    private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }


    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    //    @Override
//    public List<Quiz> get() {
//        return quizRepository.findAll();
//    }
    @Override
    public List<Quiz> get() {
        List<Quiz> quizz = quizRepository.findAll();
        List<Quiz> newQuizList = quizz.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQustionofQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return newQuizList;
    }

    @Override
    public Quiz get(Long id) {

        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getQustionofQuiz(quiz.getId()));
        return quiz;
    }
}
