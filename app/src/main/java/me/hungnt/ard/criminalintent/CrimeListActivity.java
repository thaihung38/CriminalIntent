package me.hungnt.ard.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by nguyenthaihung on 11/21/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
