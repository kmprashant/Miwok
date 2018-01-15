package com.example.android.miwok;

import java.security.PublicKey;

/**
 * Created by Prashant on 26-09-2017.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;
    private int mImageResourceId = N0_IMAGE_PROVIDED;
    private static final int N0_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation,String miwokTranslation)
    {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation =miwokTranslation;

    }
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId)
    {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation =miwokTranslation;
        mImageResourceId = imageResourceId;

    }



    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != N0_IMAGE_PROVIDED;
    }




}
