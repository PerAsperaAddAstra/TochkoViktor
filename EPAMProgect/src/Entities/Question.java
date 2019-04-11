package Entities;

import java.util.Objects;

public class Question {

    private String name;
    private int id;
    private int subjectId;

    public Question(String name, int id, int subjectId) {
        this.name = name;
        this.id = id;
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id == question.id &&
                subjectId == question.subjectId &&
                Objects.equals(name, question.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, id, subjectId);
    }

    @Override
    public String toString() {
        return "Question{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subjectId=" + subjectId +
                '}';
    }
}
