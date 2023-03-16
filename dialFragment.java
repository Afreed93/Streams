package com.example.streams.fragments;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.streams.R;

public class dialFragment extends Fragment {
    EditText edtPhoneNo;
    TextView lblinfo;
    private View v;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dial, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        edtPhoneNo = view. findViewById(R.id.edtPhoneNumber);
        lblinfo = view. findViewById(R.id.lblinfo);

        setOnButtonClickListener(view.findViewById(R.id.btnAterisk));
        setOnButtonClickListener(view.findViewById(R.id.btnHash));
        setOnButtonClickListener(view.findViewById(R.id.btnZero));
        setOnButtonClickListener(view.findViewById(R.id.btnOne));
        setOnButtonClickListener(view.findViewById(R.id.btnTwo));
        setOnButtonClickListener(view.findViewById(R.id.btnThree));
        setOnButtonClickListener(view.findViewById(R.id.btnFour));
        setOnButtonClickListener(view.findViewById(R.id.btnFive));
        setOnButtonClickListener(view.findViewById(R.id.btnSix));
        setOnButtonClickListener(view.findViewById(R.id.btnSeven));
        setOnButtonClickListener(view.findViewById(R.id.btnEight));
        setOnButtonClickListener(view.findViewById(R.id.btnNine));
        setOnButtonClickListener(view.findViewById(R.id.btndel));
        setOnButtonClickListener(view.findViewById(R.id.btnClearAll));
        setOnButtonClickListener(view.findViewById(R.id.btnCall));

    }

    public void setOnButtonClickListener(View viewById) {

        viewById.setOnClickListener(view -> {
            String phoneNo = edtPhoneNo.getText().toString();

            try {

                switch (view.getId()) {
                    case R.id.btnAterisk:
                        lblinfo.setText("");
                        phoneNo += "*";
                        edtPhoneNo.setText(phoneNo);
                        Log.i(TAG, "setOnButtonClickListener:1+ ");
                        break;
                    case R.id.btnHash:
                        lblinfo.setText("");
                        phoneNo += "#";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnZero:
                        lblinfo.setText("");
                        phoneNo += "0";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnOne:
                        lblinfo.setText("");
                        phoneNo += "1";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnTwo:
                        lblinfo.setText("");
                        phoneNo += "2";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnThree:
                        lblinfo.setText("");
                        phoneNo += "3";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnFour:
                        lblinfo.setText("");
                        phoneNo += "4";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnFive:
                        lblinfo.setText("");
                        phoneNo += "5";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnSix:
                        lblinfo.setText("");
                        phoneNo += "6";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnSeven:
                        lblinfo.setText("");
                        phoneNo += "7";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnEight:
                        lblinfo.setText("");
                        phoneNo += "8";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnNine:
                        lblinfo.setText("");
                        phoneNo += "9";
                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btndel:
                        lblinfo.setText("");
                        if (phoneNo != null && phoneNo.length() > 0) {
                            phoneNo = phoneNo.substring(0, phoneNo.length() - 1);
                        }

                        edtPhoneNo.setText(phoneNo);
                        break;
                    case R.id.btnClearAll:
                        lblinfo.setText("");
                        edtPhoneNo.setText("");
                        break;
                    case R.id.btnCall:
                        if (phoneNo.trim().equals("")) {
                            lblinfo.setText("Please enter a number to call on!");
                        } else {
                            Boolean isHash = false;
                            if (phoneNo.subSequence(phoneNo.length() - 1, phoneNo.length()).equals("#")) {
                                phoneNo = phoneNo.substring(0, phoneNo.length() - 1);
                                String callInfo = "tel:" + phoneNo + Uri.encode("#");
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse(callInfo));
                                startActivity(callIntent);
                            } else {
                                String callInfo = "tel:" + phoneNo;
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse(callInfo));
                                startActivity(callIntent);
                            }
                        }
                        break;
                }

            } catch (Exception ex) {
                Log.e(TAG, "setOnButtonClickListener: "+ex );
            }

        });
    }

}
