package com.test.english.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.exam.english.R;
import com.test.english.ui.data.MusicFragmentItemModel;

import java.util.ArrayList;

public class MusicFragmentDataAdapter extends RecyclerView.Adapter<MusicFragmentDataAdapter.SingleItemRowHolder> {

    private ArrayList<MusicFragmentItemModel> itemsList;
    private Context mContext;

    public MusicFragmentDataAdapter(Context context, ArrayList<MusicFragmentItemModel> itemsList) {
        this.itemsList = itemsList;
        this.mContext = context;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_music_image_type, null);
        SingleItemRowHolder mh = new SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(final SingleItemRowHolder holder, int i) {

        MusicFragmentItemModel singleItem = itemsList.get(i);
        holder.tvTime.setText(singleItem.getTime());
        Glide.with(mContext)
                .load(singleItem.getItem_thumbnail())
                .apply(RequestOptions.centerCropTransform())
                .into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView tvTime;
        protected ImageView itemImage;

        public SingleItemRowHolder(View view) {
            super(view);

            this.tvTime = (TextView) view.findViewById(R.id.time);
            this.itemImage = (ImageView) view.findViewById(R.id.thumbnail);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), tvTime.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}