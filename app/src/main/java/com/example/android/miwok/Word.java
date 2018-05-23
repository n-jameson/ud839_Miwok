package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String DefaultTranslation, String MiwokTranlsation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranlsation;

    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
