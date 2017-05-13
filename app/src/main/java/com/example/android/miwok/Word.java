package com.example.android.miwok;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.example.android.miwok.NumbersActivity;


/**
 *
 * Created by jaypr_000 on 5/8/2017.
 * Building a Constructor for Getting Language Names.
 *
 */

public class Word  {


        private String EnglishName;
        private String HindiName;

    public Word (String Ename, String Hname)

    {

        EnglishName = Ename;
        HindiName = Hname;

    }

    public String getEnglishWord () {

        return EnglishName;
    }

    public String getHindiWord () {

        return HindiName;
    }




}
