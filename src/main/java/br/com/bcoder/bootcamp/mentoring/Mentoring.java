package br.com.bcoder.bootcamp.mentoring;

import br.com.bcoder.bootcamp.Content;

import java.time.LocalDate;

public class Mentoring extends Content {
  private LocalDate date;

  public Mentoring ( String tile, String description, LocalDate date ) {
    this.date = date;
    this.setTitle(tile);
    this.setDescription(description);
  }

  @Override
  public double calculateXP() {
    return XP_DEFAULT + 20d;
  }

  public LocalDate getData() {
    return date;
  }

  public void setData(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return
        '\n' +
        "Mentoring: " + getTitle() + '\n' +
        "Description: " + getDescription() + '\n' +
        "Date: " + date + '\n';

  }
}
