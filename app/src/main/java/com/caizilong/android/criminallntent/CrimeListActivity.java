package com.caizilong.android.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/12/19.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
