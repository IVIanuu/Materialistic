package com.ivianuu.materialistic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import com.ivianuu.materialistic.R;

/**
 * @author Manuel Wrage (IVIanuu)
 */

public final class MaterialColorHelper {

    @ColorInt
    public static int getPrimaryTextColorFor(@NonNull Context context, @ColorInt int color) {
        return getPrimaryTextColor(context, !ColorUtil.isColorLight(color));
    }

    @ColorInt
    public static int getPrimaryTextColorAuto(@NonNull Context context) {
        return getPrimaryTextColor(context, Util.isWindowBackgroundDark(context));
    }

    @SuppressLint("PrivateResource")
    @ColorInt
    public static int getPrimaryTextColor(@NonNull Context context, boolean dark) {
        if (dark) {
            return ContextCompat.getColor(context, R.color.primary_text_default_material_dark);
        }
        return ContextCompat.getColor(context, R.color.primary_text_default_material_light);
    }

    @ColorInt
    public static int getSecondaryTextColorFor(@NonNull Context context, @ColorInt int color) {
        return getSecondaryTextColor(context, !ColorUtil.isColorLight(color));
    }

    @ColorInt
    public static int getSecondaryTextColorAuto(@NonNull Context context) {
        return getSecondaryTextColor(context, Util.isWindowBackgroundDark(context));
    }

    @SuppressLint("PrivateResource")
    @ColorInt
    public static int getSecondaryTextColor(@NonNull Context context, boolean dark) {
        if (dark) {
            return ContextCompat.getColor(context, R.color.secondary_text_default_material_dark);
        }
        return ContextCompat.getColor(context, R.color.secondary_text_default_material_light);
    }

    @ColorInt
    public static int getPrimaryDisabledTextColorFor(@NonNull Context context, @ColorInt int color) {
        return getPrimaryDisabledTextColor(context, !ColorUtil.isColorLight(color));
    }

    @ColorInt
    public static int getPrimaryDisabledTextColorAuto(@NonNull Context context) {
        return getPrimaryDisabledTextColor(context, Util.isWindowBackgroundDark(context));
    }

    @SuppressLint("PrivateResource")
    @ColorInt
    public static int getPrimaryDisabledTextColor(@NonNull Context context, boolean dark) {
        if (dark) {
            return ContextCompat.getColor(context, R.color.primary_text_disabled_material_dark);
        }
        return ContextCompat.getColor(context, R.color.primary_text_disabled_material_light);
    }

    @SuppressLint("PrivateResource")
    @ColorInt
    public static int getSecondaryDisabledTextColor(@NonNull Context context, boolean dark) {
        if (dark) {
            return ContextCompat.getColor(context, R.color.secondary_text_disabled_material_dark);
        }
        return ContextCompat.getColor(context, R.color.secondary_text_disabled_material_light);
    }

    @ColorInt
    public static int getSecondaryDisabledTextColorFor(@NonNull Context context, @ColorInt int color) {
        return getSecondaryDisabledTextColor(context, !ColorUtil.isColorLight(color));
    }

    @ColorInt
    public static int getSecondaryDisabledTextColorAuto(@NonNull Context context) {
        return getSecondaryDisabledTextColor(context, Util.isWindowBackgroundDark(context));
    }

    @ColorInt
    public static int getIconColorFor(@NonNull Context context, @ColorInt int color) {
        return getIconColor(context, !ColorUtil.isColorLight(color));
    }

    @ColorInt
    public static int getIconColorAuto(@NonNull Context context) {
        return getIconColor(context, Util.isWindowBackgroundDark(context));
    }

    @ColorInt
    public static int getIconColor(@NonNull Context context, boolean dark) {
        if (dark) {
            return ContextCompat.getColor(context, R.color.md_dark_primary_icon);
        }
        return ContextCompat.getColor(context, R.color.md_light_primary_icon);
    }

    @ColorInt
    public static int getCardColorAuto(@NonNull Context context) {
        return getCardColor(context, Util.isWindowBackgroundDark(context));
    }

    @ColorInt
    public static int getCardColor(@NonNull Context context, boolean dark) {
        if (dark) {
            return ContextCompat.getColor(context, R.color.md_dark_cards);
        }
        return ContextCompat.getColor(context, R.color.md_light_cards);
    }

    @ColorInt
    public static int getDividerColorAuto(@NonNull Context context) {
        return getDividerColor(context, Util.isWindowBackgroundDark(context));
    }

    @ColorInt
    public static int getDividerColor(@NonNull Context context, boolean dark) {
        if (dark) {
            return ContextCompat.getColor(context, R.color.md_dark_dividers);
        }
        return ContextCompat.getColor(context, R.color.md_light_dividers);
    }

    @ColorInt
    public static int getBackgroundColorAuto(@NonNull Context context) {
        return getBackgroundColor(context, Util.isWindowBackgroundDark(context));
    }

    @ColorInt
    public static int getBackgroundColor(@NonNull Context context, boolean dark) {
        if (dark) {
            return ContextCompat.getColor(context, R.color.md_dark_background);
        }
        return ContextCompat.getColor(context, R.color.md_light_background);
    }

    private MaterialColorHelper() {
    }
}
