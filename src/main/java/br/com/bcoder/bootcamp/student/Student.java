package br.com.bcoder.bootcamp.student;

import br.com.bcoder.bootcamp.Bootcamp;
import br.com.bcoder.bootcamp.Content;

import java.util.*;

public class Student {
  private String name;
  private Set<Content> contentEnrolled = new LinkedHashSet<>();
  private Set<Content> contentCompleted = new LinkedHashSet<>();

  public Student ( String name, Bootcamp contentEnrolled) {
    this.name = name;
    this.contentEnrolled.addAll(contentEnrolled.getContentSet());
    contentEnrolled.getStudents().add(this);

  }

  public void enrollBootcamp( Bootcamp bootcamp){
    this.contentEnrolled.addAll(bootcamp.getContentSet());
    bootcamp.getStudents().add(this);
  }

  public void advance() {
    Optional<Content> content = this.contentEnrolled.stream().findFirst();
    if(content.isPresent()) {
      this.contentCompleted.add(content.get());
      this.contentEnrolled.remove(content.get());
    } else {
      System.err.println("You aren't enrolled in any content.");
    }
  }

  public double calculateTotalXp() {
    Iterator<Content> iterator = this.contentCompleted.iterator();
    double sum = 0;
    while(iterator.hasNext()){
      double next = iterator.next().calculateXP();
      sum += next;
    }
    return sum;
  }


  public String getName () {
    return name;
  }

  public void setName ( String name ) {
    this.name = name;
  }

  public Set<Content> getContentEnrolled () {
    return contentEnrolled;
  }

  public void setContentEnrolled ( Set<Content> contentEnrolled ) {
    this.contentEnrolled = contentEnrolled;
  }

  public Set<Content> getContentCompleted () {
    return contentCompleted;
  }

  public void setContentCompleted ( Set<Content> contentCompleted ) {
    this.contentCompleted = contentCompleted;
  }

  @Override
  public boolean equals ( Object o ) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return name.equals(student.name) && contentEnrolled.equals(student.contentEnrolled) && contentCompleted.equals(student.contentCompleted);
  }

  @Override
  public int hashCode () {
    return Objects.hash(name, contentEnrolled, contentCompleted);
  }
}
