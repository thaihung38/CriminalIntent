package me.hungnt.ard.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import me.hungnt.ard.criminalintent.database.CrimeBaseHelper;

/**
 * Created by nguyenthaihung on 11/21/16.
 */

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    private Context mContext;

    private SQLiteDatabase mDatabase;

    private CrimeLab(Context context) {

        mContext = context.getApplicationContext();
        mDatabase = new CrimeBaseHelper(mContext).getWritableDatabase();
    }

    public static CrimeLab get(Context context) {

        if (sCrimeLab == null) sCrimeLab = new CrimeLab(context);

        return sCrimeLab;
    }

    public void addCrime(Crime c) {

    }

    public List<Crime> getCrimes() {

        return new ArrayList<>();
    }

    public Crime getCrime(UUID id) {

        return null;
    }
}
