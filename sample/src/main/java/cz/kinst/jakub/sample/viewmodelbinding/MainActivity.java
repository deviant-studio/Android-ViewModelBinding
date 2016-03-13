package cz.kinst.jakub.sample.viewmodelbinding;


import android.os.Bundle;
import android.widget.Toast;

import cz.kinst.jakub.sample.viewmodelbinding.databinding.ActivityMainBinding;
import cz.kinst.jakub.viewmodelbinding.ViewModelActivity;
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig;


/**
 * Created by jakubkinst on 10/11/15.
 */
public class MainActivity extends ViewModelActivity<ActivityMainBinding, MainViewModel> {

    @Override
    public ViewModelBindingConfig getViewModelBindingConfig() {
        return new ViewModelBindingConfig(R.layout.activity_main, MainViewModel.class);
    }

    @Override
    public void navigate(int way, Bundle params) {
        super.navigate(way, params);
        if (way == MainViewModel.WAY_DIALOG) {
            SampleDialogFragment dialog = SampleDialogFragment.newInstance();
            dialog.setListener(new SampleDialogViewModel.SampleDialogListener() {
                @Override
                public void onButtonClicked() {
                    Toast.makeText(getContext(), "Button in dialog clicked", Toast.LENGTH_SHORT).show();
                }
            });
            dialog.show(getSupportFragmentManager(), "sample");
        }
    }
}
