package com.aspire.daydreaming.core.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by yeliang
 * On 2016/7/25
 */
public class BaseFragment extends Fragment {

    public static BaseFragment newInstance(Class<? extends BaseViewHolder> vh, String type) {
        Bundle arguments = new Bundle();
        arguments.putString("", vh.getCanonicalName());
        arguments.putString("type", type);
        BaseFragment baseFragment = new BaseFragment();
        baseFragment.setArguments(arguments);
        return baseFragment;
    }
}
