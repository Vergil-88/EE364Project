/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidstatus;

/**
 *
 * @author BFO6
 */
import java.io.Serializable;
   
public class RRegion implements Serializable {
    private String NameTF;
    private int NumTF;
    private String MailTF;
    private String DateTF;

    public RRegion(String NameTF, int NumTF, String MailTF, String DateTF) {
        this.NameTF = NameTF;
        this.NumTF = NumTF;
        this.MailTF = MailTF;
        this.DateTF=DateTF;
    }

    public String getNameTF() {
        return NameTF;
    }

    public void setNameTF(String NameTF) {
        this.NameTF = NameTF;
    }

    public int getNumTF() {
        return NumTF;
    }

    public void setNumTF(int NumTF) {
        this.NumTF = NumTF;
    }

    public String getMailTF() {
        return MailTF;
    }

    public void setMailTF(String MailTF) {
        this.MailTF = MailTF;
    }

    public String getDate() {
        return DateTF;
    }

    public void setDate(String DateTF) {
        this.DateTF = DateTF;
    }

    @Override
    public String toString() {
        return "Tourist{" + "NameTF=" + NameTF + ", NumTF=" + NumTF + ", MailTF=" + MailTF + ", Date=" + DateTF + '}';
    }
    
}
