package com.demo.quizzapp;

public class Question {
    public String questions[] = {
            "What is #include<stdio.h>?",
            "In COMAL language program, after name of procedure parameters must be in?",
            "Programming language COBOL works best for use in?"
    };

    public String choices[][] = {
            {"Preprocessor Directive", "Inclusion Directive", "File Inclusion Directive", "None"},
            {"Function Marks", "Back-Slash", "Brackets", "Semi Colon"},
            {"Siemens Applications", "Student Applications", "Social Applications", "Commercial Applications"}
    };

    public String correctAnswer[] = {
            "Preprocessor Directive",
            "Brackets",
            "Commercial Applications"
    };

    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a) {
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a) {
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a) {
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a) {
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = correctAnswer[a];
        return answer;
    }
}