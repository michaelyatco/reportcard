package com.example.android.reportcard;

/**
 * Created by mjyatco on 8/7/17.
 */

public class Grade {

    private String mSubject;

    private String mMark;

    public Grade(String vSubject, String vMark) {
        mSubject = vSubject;
        mMark = vMark;
    }

    public String getSubject() {
        return mSubject;
    }

    public String getMark() {
        return mMark;
    }


}
