package com.example.mentalhealthtrackerversion1;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class accountSummaryFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}