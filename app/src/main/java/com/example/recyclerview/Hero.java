package com.example.recyclerview;

public class Hero {
    private String mName;
    private String mSkill;
    private int mImage;
    private String mPowerRating;

    public Hero(String mName,String mSkill,int mImage,String mPowerRating) {
        this.mName = mName;
        this.mSkill= mSkill;
        this.mImage = mImage;
        this.mPowerRating=mPowerRating;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }
    public String getmSkill(){
        return mSkill;
    }

    public  void setmSkill(String mSkill){
        this.mSkill = mSkill;
    }
    public int getImage() {
        return mImage;
    }

    public void setImage(int mImage) {
        this.mImage = mImage;
    }
    public String getPowerRating() {
        return mPowerRating;
    }

    public void setPowerRating(String mPowerRating) {
        this.mPowerRating = mPowerRating;
    }
}
