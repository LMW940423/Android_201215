package com.android.quiz_201215;

public class Galaxy {

    //Field
    private String prdName;
    private int icon;
    private String prdDis;

    //Constructor

    public Galaxy(String prdName, int icon, String prdDis) {
        this.prdName = prdName;
        this.icon = icon;
        this.prdDis = prdDis;
    }

    public Galaxy(String prdName) {
        this.prdName = prdName;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getPrdDis() {
        return prdDis;
    }

    public void setPrdDis(String prdDis) {
        this.prdDis = prdDis;
    }
}
