package cz.kinst.jakub.viewmodelbinding;

import android.os.Bundle;

public class Navigator<T extends ViewInterface> {

    private Bundle params;
    private Class<T> cls;
    private int id;
    private Object extraData;

    public Navigator(Class<T> cls, Bundle params, int id, Object extraData) {
        this.cls = cls;
        this.params = params;
        this.id = id;
        this.extraData = extraData;
    }

    public Navigator(Class<T> cls, Bundle params) {
        this(cls, params, 0, null);
    }

    public Navigator(Class<T> cls) {
        this(cls, null, 0, null);
    }


    public Bundle getParams() {
        return params;
    }

    public Class<T> getCls() {
        return cls;
    }

    public int getId() {
        return id;
    }

    public Object getExtraData() {
        return extraData;
    }

    public Navigator<T> with(Bundle params) {
        this.params = params;
        return this;
    }

    public static <T extends ViewInterface> Navigator<T> to(Class<T> cls) {
        return new Navigator<>(cls);
    }

}
