package Homework;

import java.time.LocalDate;

public class PensionFund {
    private String name;
    private  boolean isState;
    private LocalDate creationDate;
    private int participantsCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return isState;
    }

    public void setState(boolean state) {
        isState = state;
    }

    public LocalDate getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public int getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(int participantsCount) {
        this.participantsCount = participantsCount;
    }

    public void info(){
        String participantsText;
        if (isState) {
            participantsText = participantsCount + "тысяч";
        } else {
            participantsText = String.valueOf(participantsCount);
        }




        System.out.println("Информация о фонде" );
        System.out.println("Название:" + name);
        System.out.println("Государственный:" + isState);
        System.out.println("Дата создания:" + creationDate);
        System.out.println("Участников:" + participantsText);
    }
}
