package com.ciyou.edu.service

import com.ciyou.edu.entity.Quiz
import com.github.pagehelper.Page

/**
 * @Author C.
 * @Date 2018-02-24 23:22
 */
interface QuizService {

    Page<Quiz> findByPage(int pageNo, int pageSize)

    int addQuiz(Quiz quiz)

    Quiz getQuizById(Integer quizId)

    int updateQuiz(Quiz quiz)

    int deleteQuiz(Integer quizId)

    Page<Quiz> queryQuizByPage(String value,int pageNo, int pageSize)

    boolean quizExam(Integer sid,Integer quizId,String answer)
}
