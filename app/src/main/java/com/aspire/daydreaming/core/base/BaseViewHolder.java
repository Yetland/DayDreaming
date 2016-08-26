package com.aspire.daydreaming.core.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.aspire.daydreaming.core.utils.ViewUtil;


/**
 * Created by yeliang
 * On 2016/7/25
 */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public Context context;


    @TargetApi(Build.VERSION_CODES.KITKAT)
    public BaseViewHolder(View itemView) {
        super(itemView);

        context = itemView.getContext();
//        ViewUtils.isLayoutRtl(itemView);
        ViewUtil.autoFind(this, itemView);
    }

    public abstract int getType();

    public abstract void onBindViewHolder(View view, T t);
}
