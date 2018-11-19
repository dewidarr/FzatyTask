package com.example.dewidar.fzatytask;

import android.widget.Button;

/**
 * Created by doyde on 10/12/2017.
 */

public class waitinglist {

    String status;
    String time;
    String Gender;
    String faza_type;
    String faza_number;
    Integer imgtype;
    Button cancleButton;

    public waitinglist(){
    };
    public waitinglist(Integer imgtype,String gender, String stat, String time, String faza_type,Button cancleButton,String faza_number) {
        this.Gender = gender;
        this.status = stat;
        this.time = time;
        this.faza_type=faza_type;
        this.cancleButton=cancleButton;
        this.imgtype=imgtype;
        this.faza_number=faza_number;
    }

    public void setCancleButton(Button cancleButton) {
        this.cancleButton = cancleButton;
    }

    public Button getCancleButton() {
        return cancleButton;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setFaza_type(String faza_type) {
        this.faza_type = faza_type;
    }

    public void setFaza_number(String faza_number) {
        this.faza_number = faza_number;
    }

    public void setImgtype(Integer imgtype) {
        this.imgtype = imgtype;
    }

    public String getStatus() {
        return status;
    }

    public String getTime() {
        return time;
    }

    public String getGender() {
        return Gender;
    }

    public String getFaza_type() {
        return faza_type;
    }

    public String getFaza_number() {
        return faza_number;
    }

    public Integer getImgtype() {
        return imgtype;
    }
}
