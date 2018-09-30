package edu.fritzcamoregonstate.eventbuddy;

public class Event {

    private int mNameResId;
    private int mLocationResId;
    private int mDateResId;

    public Event(int nameResId, int locationResId, int dateResId) {
        mNameResId = nameResId;
        mLocationResId = locationResId;
        mDateResId = dateResId;
    }

    public int getNameResId() {
        return mNameResId;
    }

    public void setNameResId(int nameResId) {
        mNameResId = nameResId;
    }

    public int getLocationResId() {
        return mLocationResId;
    }

    public void setLocationResId(int locationResId) {
        mLocationResId = locationResId;
    }

    public int getDateResId() {
        return mDateResId;
    }

    public void setDateResId(int dateResId) {
        mDateResId = dateResId;
    }
}
