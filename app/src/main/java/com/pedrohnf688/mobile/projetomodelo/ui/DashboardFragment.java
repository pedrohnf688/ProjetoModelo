package com.pedrohnf688.mobile.projetomodelo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.textfield.TextInputEditText;
import com.pedrohnf688.mobile.projetomodelo.R;

public class DashboardFragment extends Fragment {

    TextInputEditText email, username;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        email = view.findViewById(R.id.email);
        username = view.findViewById(R.id.username);

        email.setText("pedrohnf2014@gmail.com");
        username.setText("pedrohnf88");

        return view;
    }
}
