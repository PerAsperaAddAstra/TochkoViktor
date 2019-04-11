package Entities;

import java.util.Objects;

public class Tutor {

    private String name;
    private int id;

    public Tutor(String name, int id) {
        this.name = name;
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return id == tutor.id &&
                Objects.equals(name, tutor.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
