package cz.kinst.jakub.sample.viewmodelbinding;

import cz.kinst.jakub.sample.viewmodelbinding.databinding.DialogSampleBinding;
import cz.kinst.jakub.viewmodelbinding.*;


public class SampleDialogFragment extends ViewModelDialogFragment<DialogSampleBinding, SampleDialogViewModel> {

	@Override
	public ViewModelBindingConfig getViewModelBindingConfig() {
		return new ViewModelBindingConfig(R.layout.dialog_sample, SampleDialogViewModel.class);
	}

	@Override
	public void navigate(Navigator n) {
		dismiss();
	}
}
