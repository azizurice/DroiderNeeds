package com.letscodes.apptwelve.com.letscodes.apptwelve;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Azizur on 12/01/2017.
 */

public class Home implements Parcelable {
    private String homeId;
    private String streetName;
    private String address;
    private String state;
    private String postCode;
    private String country;
//    private String description;
//    private String appartmentNo;
//    private String bedrooms;
//    private String bathrooms;
//    private List<Image> images;
//    private Double rent;
//    private int parkingSpots;


    public Home(String homeId, String streetName, String address, String state, String postCode, String country) {
        this.homeId = homeId;
        this.streetName = streetName;
        this.address = address;
        this.state = state;
        this.postCode = postCode;
        this.country = country;
    }

    protected Home(Parcel in) {
        homeId = in.readString();
        streetName = in.readString();
        address = in.readString();
        state = in.readString();
        postCode = in.readString();
        country = in.readString();
    }

    public static final Creator<Home> CREATOR = new Creator<Home>() {
        @Override
        public Home createFromParcel(Parcel in) {
            return new Home(in);
        }

        @Override
        public Home[] newArray(int size) {
            return new Home[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(homeId);
        dest.writeString(streetName);
        dest.writeString(address);
        dest.writeString(state);
        dest.writeString(postCode);
        dest.writeString(country);
    }

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
