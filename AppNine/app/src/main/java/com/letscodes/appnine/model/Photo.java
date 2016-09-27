package com.letscodes.appnine.model;

import com.letscodes.appnine.R;

/**
 * Created by Azizur on 25/09/2016.
 */
public class Photo {
    private String caption;
    private int imageResourceId;

    public Photo(String caption, int imageResourceId) {
        this.caption = caption;
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public static final Photo[] photos={
      new Photo("Athabaska Falls,Alberta", R.drawable.diavolo),
      new Photo("Cable Car,Jasper",R.drawable.funghi)
     // new Photo("Grizly Bear, road side BC ", R.drawable.grizlybear),
      //new Photo("Mountain Goat, Hinton, AB", R.drawable.mountaingoat),
     // new Photo("Road Side Mountain, Banff,AB", R.drawable.roadsidemountain)
    };
}
