package com.aspire.daydreaming.bundle.main.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aspire.daydreaming.R;
import com.aspire.daydreaming.core.model.info.ActivityInfo;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @Name: ${NAME}
 * @Author: yeliang
 * @Date: 2016/4/19
 */
public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ActivityHolder> {


    private List<ActivityInfo> activityModels;
    private OnItemClickListener mOnItemClickListener;
    private OnImageItemClickListener mOnImageItemClickListener;

    public ActivityAdapter(List<ActivityInfo> activityModels) {
        this.activityModels = activityModels;
    }

    @Override
    public ActivityHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity, parent, false);


        return new ActivityHolder(view);
    }

    @Override
    public void onBindViewHolder(ActivityHolder holder, int position) {
        holder.setData(activityModels.get(position));
        holder.itemView.setOnClickListener(v -> mOnItemClickListener.onItemClick(position));
    }

    @Override
    public int getItemCount() {
        return activityModels.size();
    }

    public void setOnItemClickListener(ActivityAdapter.OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    public void setOnImageItemClickListener(ActivityAdapter.OnImageItemClickListener onImageItemClickListener) {
        mOnImageItemClickListener = onImageItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public interface OnImageItemClickListener {
        void onItemClick(int position);
    }

    class ActivityHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.school_name)
        TextView schoolName;
        @Bind(R.id.activity_title)
        TextView activityTitle;
        @Bind(R.id.content_message)
        TextView contentMessage;
        @Bind(R.id.time)
        TextView time;
        @Bind(R.id.creator_name)
        TextView creatorName;

        ActivityHolder(View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData(ActivityInfo activityInfo) {
            schoolName.setText(activityInfo.getCreator().getSchoolName());
            activityTitle.setText(activityInfo.getTitle());
            contentMessage.setText(activityInfo.getContentMessage());
            time.setText(activityInfo.createdAt);
            creatorName.setText(activityInfo.getCreator().getUsername());
        }
    }
}
