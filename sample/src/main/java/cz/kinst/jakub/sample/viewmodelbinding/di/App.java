package cz.kinst.jakub.sample.viewmodelbinding.di;

import android.app.Application;

public class App extends Application {
    public static MainComponent mainComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mainComponent = DaggerMainComponent.builder().appModule(new AppModule(this)).build();
    }
}
