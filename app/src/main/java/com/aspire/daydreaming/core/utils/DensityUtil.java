package com.aspire.daydreaming.core.utils;

import android.content.Context;

public class DensityUtil {

	/**
	 * 从 dp转成为 px(像素)
	 */
	public static int dp2px(Context context, double dp) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dp * scale + 0.5f);
	}

	/**
	 * 从 px(像素)转成为 dp
	 */
	public static int px2dp(Context context, double px) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (px / scale + 0.5f);
	}
}