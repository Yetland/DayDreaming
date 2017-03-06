package com.aspire.daydreaming.bundle.myActivity.image;import android.content.Intent;import android.os.Bundle;import android.support.v4.view.ViewPager;import android.support.v7.app.AppCompatActivity;import android.support.v7.widget.Toolbar;import android.widget.TextView;import com.aspire.daydreaming.R;import com.aspire.daydreaming.core.widget.CustomPagerAdapter;import java.util.ArrayList;import java.util.Collections;import java.util.List;import butterknife.Bind;import butterknife.ButterKnife;public class ImageActivity extends AppCompatActivity {    @Bind(R.id.toolbar)    Toolbar mToolbar;    @Bind(R.id.tv_title)    TextView mTvTitle;    @Bind(R.id.tv_update)    TextView mTvUpdate;    @Bind(R.id.tv_position)    TextView mTvPosition;    @Bind(R.id.tv_total)    TextView mTvTotal;    @Bind(R.id.vp_image)    ViewPager mVpImage;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_image);        ButterKnife.bind(this);        mToolbar.setTitle(" ");        mTvTitle.setText("图片详情");        setSupportActionBar(mToolbar);        getSupportActionBar().setDisplayHomeAsUpEnabled(true);        mToolbar.setNavigationOnClickListener(view -> onBackPressed());        List<String> urls = new ArrayList<>();        Intent intent = getIntent();        String[] url = intent.getStringExtra("urls").split(";");        Collections.addAll(urls, url);        int position = intent.getIntExtra("position", 1);        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(this, urls);        mVpImage.setAdapter(customPagerAdapter);        mTvTotal.setText(String.valueOf(urls.size()));        mTvPosition.setText(String.valueOf(position + 1));        mVpImage.setCurrentItem(position);        mVpImage.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {            @Override            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {            }            @Override            public void onPageSelected(int position) {                mTvPosition.setText(String.valueOf(position + 1));            }            @Override            public void onPageScrollStateChanged(int state) {            }        });    }}