package com.ms.trivia.model;
import java.util.*;
import java.util.Objects;

final public class TriviaQuestion {
final private long id;
final private String question;
final private String answerA;
final private String answerB;
final private String answerC;
final private String answerD;
final private String correctAnswer;
final private String hint;
final private Date lastModified;
TriviaQuestion(long id,String question,String answerA,String answerB,String answerC, String answerD, String correctAnswer,String hint, Date lastModified){
	this.id=id;
	this.question = question;
	this.answerA = answerA;
	this.answerB = answerB;
	this.answerC = answerC;
	this.answerD = answerD;
	this.correctAnswer = correctAnswer;
	this.hint = hint;
	this.lastModified = new Date(lastModified.getTime());
	
}
public String getQuestion() {
	return question;
}
public String getAnswerA() {
	return answerA;
}
public String getAnswerB() {
	return answerB;
}
public String getAnswerC() {
	return answerC;
}
public String getAnswerD() {
	return answerD;
}
public String getCorrectAnswer() {
	return correctAnswer;
}
public String getHint() {
	return hint;
}
public Date getLastModified() {
	return lastModified;
}
public long getId() {
	return id;
}

@Override
public int hashCode() {
    int hash = 7;
    hash = 71 * hash + (int) (this.id ^ (this.id >>> 32));
    hash = 71 * hash + Objects.hashCode(this.question);
    hash = 71 * hash + Objects.hashCode(this.answerA);
    hash = 71 * hash + Objects.hashCode(this.answerB);
    hash = 71 * hash + Objects.hashCode(this.answerC);
    hash = 71 * hash + Objects.hashCode(this.answerD);
    hash = 71 * hash + Objects.hashCode(this.correctAnswer);
    hash = 71 * hash + Objects.hashCode(this.hint);
    hash = 71 * hash + Objects.hashCode(this.lastModified);
    return hash;
}

@Override
public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    final TriviaQuestion other = (TriviaQuestion) obj;
    if (this.id != other.id) {
        return false;
    }
    if (!Objects.equals(this.question, other.question)) {
        return false;
    }
    if (!Objects.equals(this.answerA, other.answerA)) {
        return false;
    }
    if (!Objects.equals(this.answerB, other.answerB)) {
        return false;
    }
    if (!Objects.equals(this.answerC, other.answerC)) {
        return false;
    }
    if (!Objects.equals(this.answerD, other.answerD)) {
        return false;
    }
    if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
        return false;
    }
    if (!Objects.equals(this.hint, other.hint)) {
        return false;
    }
    if (!Objects.equals(this.lastModified, other.lastModified)) {
        return false;
    }
    return true;
}

}
