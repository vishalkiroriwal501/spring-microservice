package com.quizservice.QuizService.ServiceImpl;


import com.quizservice.QuizService.Entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8082",value = "Qustion-Service")
@FeignClient(name = "QUSTION-SERVICE")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQustionofQuiz(@PathVariable Long quizId);
}
