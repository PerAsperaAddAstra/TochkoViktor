package Entities;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String groupName;
    private int id;

    public Student(String name, int age, String groupName, int id) {
        this.name = name;
        this.age = age;
        this.groupName = groupName;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                id == student.id &&
                Objects.equals(name, student.name) &&
                Objects.equals(groupName, student.groupName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, groupName, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupName='" + groupName + '\'' +
                ", id=" + id +
                '}';
    }
}
