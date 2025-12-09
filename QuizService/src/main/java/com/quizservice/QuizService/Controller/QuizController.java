package com.quizservice.QuizService.Controller;


import com.quizservice.QuizService.Entity.Quiz;
import com.quizservice.QuizService.Service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {


    private QuizService quizService;
    public QuizController(@RequestBody QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id){
        return quizService.get(id);
    }
}
