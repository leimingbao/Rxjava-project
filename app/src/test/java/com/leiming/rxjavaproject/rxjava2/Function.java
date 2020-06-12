package com.leiming.rxjavaproject.rxjava2;

//实现转换与传递的功能
public interface Function<T,U> {
    //对输入值运用一些计算，得到一个结果，载传到下游

    U apply(T t);
}
