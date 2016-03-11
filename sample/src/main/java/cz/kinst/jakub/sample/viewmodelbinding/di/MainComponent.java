package cz.kinst.jakub.sample.viewmodelbinding.di;

import javax.inject.Singleton;

import cz.kinst.jakub.sample.viewmodelbinding.MainViewModel;
import dagger.Component;

@Singleton
@Component(
		modules = {
				AppModule.class
		}
)
public interface MainComponent {
	void inject(MainViewModel obj);
}
