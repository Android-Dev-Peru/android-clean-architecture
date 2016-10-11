package com.cap.data.repository.datasource;

import android.content.Context;

/**
 * Created by CAP on 01/10/2016.
 */

public class DataStoreFactory {

    private final Context context;

    public DataStoreFactory(Context context) {
        this.context = context;
    }

    public DataStore createDataStore(){
        return new CloudDataStore();
    }
}
