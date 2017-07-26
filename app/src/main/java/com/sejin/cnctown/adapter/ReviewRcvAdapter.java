package com.sejin.cnctown.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.sejin.cnctown.R;
import com.sejin.cnctown.data.ReviewData;

import java.util.ArrayList;


/**
 * Created by sejin on 2017. 7. 20..
 */


public class ReviewRcvAdapter extends RecyclerView.Adapter<ReviewRcvAdapter.ViewHolder> {

    ArrayList<ReviewData> reviewList;

    public ReviewRcvAdapter(ArrayList<ReviewData> reviewList) {
        this.reviewList = reviewList;
    }


    @Override
    public ReviewRcvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_act_detail_review, parent, false);
        ViewHolder viewHolder = new ReviewRcvAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ReviewRcvAdapter.ViewHolder holder, int position) {
        final ReviewData reviewData = reviewList.get(position);

        holder.mUserId.setText(reviewData.getId());
        holder.mDate.setText(reviewData.getDate());
        holder.mReview.setText(reviewData.getReview());

    }


    @Override
    public int getItemCount() {
        return reviewList.size();

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView mUserId, mDate, mReview;
        RatingBar rate;

        public ViewHolder(View itemView) {
            super(itemView);

            mUserId = (TextView) itemView.findViewById(R.id.review_id);
            mDate = (TextView) itemView.findViewById(R.id.review_date);
            mReview = (TextView) itemView.findViewById(R.id.review_content);
        }

    }

}
