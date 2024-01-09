package Homework;

import javax.lang.model.element.Name;
import java.util.Date;

public class PensionFund extends Person{

    private String name;
    private  boolean isStateFund;
    private Date creationDate;

    private int participantsCount;

    public PensionFund(int money) {
        super(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStateFund() {
        return isStateFund;
    }

    public void setStateFund(boolean stateFund) {
        isStateFund = stateFund;
    }

    public Date getCreationDate() {
        return creationDate;
    }


    public int getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(int participantsCount) {
        this.participantsCount = participantsCount;
    }

    public void info(){
        String participantsStr = isStateFund ? participantsCount + "тысяча" : participantsCount + "";
        System.out.println("Информация о фонде" + name);
        System.out.println("Государственный:" + isStateFund);
        System.out.println("Дата создания:" + creationDate);
        System.out.println("Участников:" + participantsStr);
    }
}
