package com.caizilong.android.criminallntent;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2017/12/19.
 */

public class Crime {



    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public String getmSuspect() {
        return mSuspect;
    }

    public void setmSuspect(String mSuspect) {
        this.mSuspect = mSuspect;
    }

    private String mSuspect;


    public Crime(UUID id ) {

        mId = id;

        mDate = new Date();

    }



    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
