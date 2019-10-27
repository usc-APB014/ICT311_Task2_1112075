package android.bignerdranch.com;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private String mDetail;
    private String mPlace;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;
    private String mLocation;
    private double mLat;
    private double mLon;


    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) { mId = id;
        mDate = new Date(); }

    public UUID getId() {
        return mId; }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title; }

    public String getDetail() {
        return mDetail;
    }

    public void setDetail(String detail) {
        mDetail = detail; }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        mPlace = place; }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date; }

    public boolean isSolved() {

        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }


    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {

        mSuspect = suspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    public void  setLatitude(double Lat) {
        mLat = Lat;
    }

    public Double getLatitude() {
        return mLat;
    }

    public void setLongitude(double Lon) {
        mLon = Lon;
    }

    public Double getLongitude() {
        return mLon;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getLocation() {
        return mLocation;
    }








}

