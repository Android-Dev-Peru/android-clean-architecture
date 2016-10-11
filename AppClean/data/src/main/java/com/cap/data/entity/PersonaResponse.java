package com.cap.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by CAP on 05/10/2016.
 */

public class PersonaResponse extends BaseResponse{

    @SerializedName("offset")
    @Expose
    private int offset;

    @SerializedName("data")
    @Expose
    private ArrayList<PersonaEntity> data;

    @SerializedName("nextPage")
    @Expose
    private Object nextPage;

    @SerializedName("totalObjects")
    @Expose
    private int totalObjects;

    public ArrayList<PersonaEntity> getData() {
        return data;
    }

    public void setData(ArrayList<PersonaEntity> data) {
        this.data = data;
    }

    public Object getNextPage() {
        return nextPage;
    }

    public void setNextPage(Object nextPage) {
        this.nextPage = nextPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotalObjects() {
        return totalObjects;
    }

    public void setTotalObjects(int totalObjects) {
        this.totalObjects = totalObjects;
    }
}
