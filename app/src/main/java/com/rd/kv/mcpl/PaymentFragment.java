package com.rd.kv.mcpl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Nandha on 01-02-2016.
 */
public class PaymentFragment extends Fragment {

    public PaymentFragment() {
    }

    private RadioGroup radioGroup;
    private LinearLayout layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.payments, container, false);

        /* Initialize Radio Group and attach click handler */
        radioGroup = (RadioGroup) rootView.findViewById(R.id.radioPayment);
        layout = (LinearLayout) rootView.findViewById(R.id.layout_cheque);
        radioGroup.clearCheck();

        /* Attach CheckedChangeListener to radio group */
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    Toast.makeText(getActivity(), rb.getText(), Toast.LENGTH_SHORT).show();
                }
                String text = rb.getText().toString();
                if (text.contentEquals("Cheque")) {
                    layout.setVisibility(View.VISIBLE);
                }
                else {
                    layout.setVisibility(View.GONE);
                }

            }
        });
        return rootView;
    }
}
