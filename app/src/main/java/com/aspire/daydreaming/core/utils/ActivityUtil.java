package com.aspire.daydreaming.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class ActivityUtil {
	public static final String USER_PREFERENCE = "user_preference";
	public static final String CURRENT_USER_NAME = "current_user_name";
	public static final String CURRENT_PASSWORD = "current_user_password";
	public static final String MOBILE = "mobile";

	public static void toast(Context context, String msg ){
		Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
	}
	
	public static void saveCurrentUser(Context context, String info) {
		SharedPreferences preferences = context.getSharedPreferences(USER_PREFERENCE, Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(CURRENT_USER_NAME, info);
		editor.apply();
	}

	public static void clearCurrentUser(Context context){
		SharedPreferences preferences = context.getSharedPreferences(USER_PREFERENCE, Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(CURRENT_USER_NAME, "");
		editor.apply();
	}


	public static String getCurrentUser(Context context){
		SharedPreferences preferences = context.getSharedPreferences(USER_PREFERENCE, Activity.MODE_PRIVATE);
		return preferences.getString(CURRENT_USER_NAME, "");
	}

	
	public static void savePassword(Context context, String info) {
		SharedPreferences preferences = context.getSharedPreferences(USER_PREFERENCE, Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(CURRENT_PASSWORD, info);
		editor.apply();
	}

	
	public static String getPassword(Context context){
		SharedPreferences preferences = context.getSharedPreferences(USER_PREFERENCE, Activity.MODE_PRIVATE);
		return preferences.getString(CURRENT_PASSWORD, "");
	}

	public static void saveMobile(Context context, String mobile){
		SharedPreferences preferences = context.getSharedPreferences(USER_PREFERENCE, Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(MOBILE, mobile);
		editor.apply();
	}

	public static String getMobile(Context context){
		SharedPreferences preferences = context.getSharedPreferences(USER_PREFERENCE, Activity.MODE_PRIVATE);
		return preferences.getString(MOBILE, "");
	}
}
