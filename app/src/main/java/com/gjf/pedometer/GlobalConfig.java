package com.gjf.pedometer;

import android.content.Context;

/**
 * Created by guojunfu on 18/2/11.
 */
public class GlobalConfig {
    private static Context sContext;

    public static void setAppContext(Context context) {
        sContext = context;
    }

    public static Context getAppContext() {
        return sContext;
    }

}
