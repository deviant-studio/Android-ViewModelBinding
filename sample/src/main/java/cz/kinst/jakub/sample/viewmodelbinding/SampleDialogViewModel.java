package cz.kinst.jakub.sample.viewmodelbinding;

import android.view.View;
import android.widget.Toast;

import cz.kinst.jakub.sample.viewmodelbinding.databinding.DialogSampleBinding;
import cz.kinst.jakub.viewmodelbinding.ViewModel;


public class SampleDialogViewModel extends ViewModel<DialogSampleBinding> {

	public void onClickedButton(View v) {
		Toast.makeText(getContext(), "Button in dialog clicked", Toast.LENGTH_SHORT).show();
		getView().navigate(null);
	}

}
