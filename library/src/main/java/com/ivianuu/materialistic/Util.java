package com.ivianuu.materialistic;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;

/**
 * @author Manuel Wrage (IVIanuu)
 */

public class Util {

    public static boolean isWindowBackgroundDark(@NonNull Context context) {
        return !ColorUtil.isColorLight(resolveColor(context, android.R.attr.windowBackground));
    }

    public static int resolveColor(@NonNull Context context, @AttrRes int attr) {
        return resolveColor(context, attr, 0);
    }

    public static int resolveColor(@NonNull Context context, @AttrRes int attr, int fallback) {
        TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a.getColor(0, fallback);
        } finally {
            a.recycle();
        }
    }

}
