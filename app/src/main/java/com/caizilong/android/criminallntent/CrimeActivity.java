package com.caizilong.android.criminallntent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;


public class CrimeActivity extends SingleFragmentActivity {
    public static final String EXTRA_CRIME_ID =
            "com.bignerdranch.android.criminalintent.crime_id";
    public static final String EXTRA_CRIME_POSITION =
            "com.bignerdranch.android.criminalintent.crime_position";
    @Override
    protected Fragment createFragment() {
        return CrimeFragment.newInstance((UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID));
    }

    public static Intent newIntent(Context context, UUID crimeId, int position){

        Intent intent = new Intent(context, CrimeActivity.class);

        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        intent.putExtra(EXTRA_CRIME_POSITION, position);
        return intent;
    }

    @Override
    public void onBackPressed() {

        returnResult();

        super.onBackPressed();
    }

    public void returnResult(){
        setResult(Activity.RESULT_OK, getIntent());
    }

}
