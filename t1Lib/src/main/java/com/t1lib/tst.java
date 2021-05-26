package com.t1lib;

import android.content.Context;
import android.widget.Toast;

public class tst {
    public static void toastAlert(Context context, String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
