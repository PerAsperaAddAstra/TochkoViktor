package Entities;

import java.util.Objects;

public class Test {

    private String name;
    private int id;
    private int tutorId;

    public Test(String name, int id, int tutorId) {
        this.name = name;
        this.id = id;
        this.tutorId = tutorId;
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

    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id == test.id &&
                tutorId == test.tutorId &&
                Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, id, tutorId);
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", tutorId=" + tutorId +
                '}';
    }
}
