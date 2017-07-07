package com.example.android.miwok;

/**
 * Created by Zainab😉 on 06/07/2017.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     *  gets the default translation of the word
     */

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * gets the miwok translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

}
