package com.cap.presenter.presenter;

/**
 * Created by CAP on 30/09/2016.
 */

public interface Presenter<T> {

    void setView(T view);

    void resume();

    void pause();

    void destroy();
}
