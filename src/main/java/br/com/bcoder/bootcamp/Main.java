package br.com.bcoder.bootcamp;

import br.com.bcoder.bootcamp.course.Course;
import br.com.bcoder.bootcamp.mentoring.Mentoring;
import br.com.bcoder.bootcamp.student.Student;

import java.time.LocalDate;

public class Main {
  public static void main ( String[] args ) {
    Course courseAWS1 = new Course("AWS Cloud", "AWS Cloud Practitioner", 114);
    Course courseJAVA1 = new Course("Java for Beginners", "A Java course for Beginners", 8);
    Mentoring mentoringAWS = new Mentoring("AWS N1 mentoring", "Mentoring for AWS Beginners", LocalDate.now());


    Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Bootcamp Java Developer");
    bootcamp.getContentSet().add(courseAWS1);
    bootcamp.getContentSet().add(courseJAVA1);
    bootcamp.getContentSet().add(mentoringAWS);

    Student studentN1 = new Student("Mary", bootcamp);
    studentN1.advance();
    System.out.println("Enrolled Content " + studentN1.getName() + ":" + studentN1.getContentEnrolled());
    studentN1.advance();
    System.out.println("Completed Content " + studentN1.getName() + ":" + studentN1.getContentCompleted());
    System.out.println("XP:" + studentN1.calculateTotalXp());

    System.out.println("-------");

    Student studentN2 = new Student("Alec", bootcamp);
    studentN2.advance();
    System.out.println("Enrolled Content " + studentN2.getName() + ":" + studentN2.getContentEnrolled());
    System.out.println("Completed Content " + studentN2.getName() + ":" + studentN2.getContentCompleted());
    System.out.println("XP:" + studentN2.calculateTotalXp());

    System.out.println("-------");

  }
}
