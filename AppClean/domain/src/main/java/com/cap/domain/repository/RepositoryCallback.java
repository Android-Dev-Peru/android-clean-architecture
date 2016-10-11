package com.cap.domain.repository;



/**
 * Created by CAP on 04/10/2016.
 */

public interface RepositoryCallback {

    void onError(Object object);
    void onSuccess(Object object);
}
