package br.com.bcoder.bootcamp;

import br.com.bcoder.bootcamp.student.Student;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
  private String name;
  private String description;
  private final LocalDate startAt = LocalDate.now();
  private final LocalDate endAt = startAt.plusDays(45);
  private Set<Student> students = new HashSet<>();
  private Set<Content> contentSet = new LinkedHashSet<>();

  public String getName () {
    return name;
  }

  public Bootcamp ( String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void setName ( String name ) {
    this.name = name;
  }

  public String getDescription () {
    return description;
  }

  public void setDescription ( String description ) {
    this.description = description;
  }

  public LocalDate getStartAt () {
    return startAt;
  }

  public LocalDate getEndAt () {
    return endAt;
  }

  public Set<Student> getStudents () {
    return students;
  }

  public void setStudents ( Set<Student> students ) {
    this.students = students;
  }

  public Set<Content> getContentSet () {
    return contentSet;
  }

  public void setContentSet ( Set<Content> contentSet ) {
    this.contentSet = contentSet;
  }

  @Override
  public boolean equals ( Object o ) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bootcamp bootcamp = (Bootcamp) o;
    return name.equals(bootcamp.name) && description.equals(bootcamp.description) && startAt.equals(bootcamp.startAt) && endAt.equals(bootcamp.endAt) && students.equals(bootcamp.students) && contentSet.equals(bootcamp.contentSet);
  }

  @Override
  public int hashCode () {
    return Objects.hash(name, description, startAt, endAt, students, contentSet);
  }

  @Override
  public String toString () {
    return
        '\n' +
        "Bootcamp: " + name + '\n' +
        "Description='" + description + '\n' +
        "Start At=" + startAt + '\n' +
        "End At=" + endAt + '\n' +
        "Students=" + students + '\n' +
        "Content=" + contentSet + '\n';

  }
}
