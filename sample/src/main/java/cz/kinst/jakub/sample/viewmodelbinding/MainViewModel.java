package cz.kinst.jakub.sample.viewmodelbinding;

import android.databinding.ObservableField;
import android.view.View;

import cz.kinst.jakub.sample.viewmodelbinding.databinding.ActivityMainBinding;
import cz.kinst.jakub.viewmodelbinding.Navigator;
import cz.kinst.jakub.viewmodelbinding.ViewModel;


/**
 * Created by jakubkinst on 10/11/15.
 */
public class MainViewModel extends ViewModel<ActivityMainBinding> {

    public static final int WAY_DIALOG = 1;

    public ObservableField<String> name = new ObservableField<>();

    @Override
    public void onViewModelCreated() {
        super.onViewModelCreated();
        // Do API calls etc.
    }


    @Override
    public void onViewAttached(boolean firstAttachment) {
        super.onViewAttached(firstAttachment);
        // manipulate with the view
    }


    public void onClickGreetButton(View v) {
        name.set(getBinding().nameEditText.getText().toString());
    }


    public void onClickedShowDialogFragmentButton(View v) {
        getView().navigate(Navigator.to(SampleDialogFragment.class));
    }


    @Override
    public void onViewModelDestroyed() {
        super.onViewModelDestroyed();
        // Cancel API calls
    }


}
