package com.letscodes.appnine.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.letscodes.appnine.R;
import com.letscodes.appnine.adapter.PhotoCaptionedAdapter;
import com.letscodes.appnine.model.Photo;

/**
 * Created by Azizur on 25/09/2016.
 */
public class PhotoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        RecyclerView photoRecycler=(RecyclerView)inflater.inflate(R.layout.photo_fragment,container,false);
        String[] photoCaptions=new String[Photo.photos.length];
        int[] photoIds = new int[Photo.photos.length];
        for(int i=0; i<photoCaptions.length; i++){
            photoCaptions[i] =Photo.photos[i].getCaption();
            photoIds[i]=Photo.photos[i].getImageResourceId();
        }
        PhotoCaptionedAdapter adapter= new PhotoCaptionedAdapter(photoIds,photoCaptions);
        photoRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        photoRecycler.setLayoutManager(layoutManager);
        adapter.setListener(new PhotoCaptionedAdapter.Listener(){

            @Override
            public void onClick(int position) {
                // intent for calling detail description of the photos.
            }
        });
        return photoRecycler;

    }
}


