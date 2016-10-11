package com.cap.data.entity.mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAP on 30/09/2016.
 */

public abstract class Mapper<T1,T2> {

    public abstract T2 map(T1 value);
    public abstract T1 reverseMap(T2 value);


}
