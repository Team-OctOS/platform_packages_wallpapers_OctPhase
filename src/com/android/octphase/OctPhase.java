package com.android.octphase;

import android.app.Activity;
import android.os.Bundle;

public class OctPhase extends Activity {

    private OctPhaseView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new OctPhaseView(this);
        setContentView(mView);
    }
}
