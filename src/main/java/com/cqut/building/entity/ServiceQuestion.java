package com.cqut.building.entity;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question
 * 作者：王进渝
 * 日期：2019-11-06
 */
public class ServiceQuestion {

    /**
     * id:问题id
     */
    private String id;

    /**
     * title:题目
     */
    private String title;

    /**
     * question:问题
     */
    private String question;

    /**
     * questionType:问题类型（1-单选、2-填空）
     */
    private String questionType;

    /**
     * answerDescription:选项描述
     */
    private String answerDescription;

    /**
     * correctAnswer:正确答案
     */
    private String correctAnswer;

    /**
     * picture:图片
     */
    private String picture;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    public String getAnswerDescription() {
        return answerDescription;
    }

    public void setAnswerDescription(String answerDescription) {
        this.answerDescription = answerDescription == null ? null : answerDescription.trim();
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer == null ? null : correctAnswer.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}