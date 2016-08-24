package com.aspire.daydreaming.bundle.main.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aspire.daydreaming.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * @Name: ${NAME}
 * @Author: 亮
 * @Date: 2016/3/4
 */
public class MainActivityPagerAdapter extends PagerAdapter {

    private Context context;
    private List<String> url;

    public MainActivityPagerAdapter(Context context, List<String> url) {
        this.context = context;
        this.url = url;
    }

    @Override
    public int getCount() {
        return url.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView iv = new ImageView(context);

        String imgUrl = url.get(position);
        Picasso.with(context)
                .load(imgUrl)
                .resize(640, 360)
                .centerCrop()
                .placeholder(R.mipmap.img_custom)
                .into(iv);

        container.addView(iv, 0);
        return iv;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
