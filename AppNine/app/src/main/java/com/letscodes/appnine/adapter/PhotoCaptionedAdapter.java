
package com.letscodes.appnine.adapter;


import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.letscodes.appnine.R;

/**
 * Created by Azizur on 25/09/2016.
 */
public class PhotoCaptionedAdapter extends RecyclerView.Adapter<PhotoCaptionedAdapter.ViewHolder> {
    private int[] imageIds;
    private String[] captions;
    private Listener listener;

    public PhotoCaptionedAdapter(int[] imageIds, String[] captions) {
        this.imageIds = imageIds;
        this.captions = captions;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView =(CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.photo_card_view,parent,false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        ImageView imageView =(ImageView)cardView.findViewById(R.id.info_image);
        Drawable drawable = cardView.getResources().getDrawable(imageIds[position]);
        imageView.setImageDrawable(drawable);
        TextView textView=(TextView)cardView.findViewById(R.id.info_text);
        textView.setText(captions[position]);
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView itemView) {
            super(itemView);
            cardView=itemView;
        }
    }
    public static interface Listener {
        public void onClick(int position);
    }
}
