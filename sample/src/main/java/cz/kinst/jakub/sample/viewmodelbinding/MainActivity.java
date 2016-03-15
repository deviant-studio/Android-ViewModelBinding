package cz.kinst.jakub.sample.viewmodelbinding;


import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

import cz.kinst.jakub.sample.viewmodelbinding.databinding.ActivityMainBinding;
import cz.kinst.jakub.viewmodelbinding.*;


/**
 * Created by jakubkinst on 10/11/15.
 */
public class MainActivity extends ViewModelActivity<ActivityMainBinding, MainViewModel> {

    @Override
    public ViewModelBindingConfig getViewModelBindingConfig() {
        return new ViewModelBindingConfig(R.layout.activity_main, MainViewModel.class);
    }

    @Override
    public void navigate(Navigator n) {
        switch (n.getId()) {    // decide where to go
            default:
                DialogFragment dialog = (DialogFragment) Fragment.instantiate(this, n.getCls().getName(), n.getParams());
                dialog.show(getSupportFragmentManager(), "sample");
        }
    }
}
