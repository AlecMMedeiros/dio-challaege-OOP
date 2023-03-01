package br.com.bcoder.bootcamp.course;
import br.com.bcoder.bootcamp.Content;

public class Course extends Content {
  private int duration;

  public Course ( String title, String description , int duration) {
    this.duration = duration;
    this.setTitle(title);
    this.setDescription(description);
  }

  @Override
  public double calculateXP() {
    return XP_DEFAULT * duration;
  }

  public int getDuration() {
    return this.duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public String toString() {
    return
        "\n" +
        "Course: " + getTitle() + '\n' +
        "Description: " + getDescription() + '\n' +
        "Duration : " + duration + "h" + '\n';
  }
}
