package me.hungnt.ard.criminalintent.database;

/**
 * Created by nguyenthaihung on 1/3/17.
 */

public class CrimeDbSchema
{
    public static final class CrimeTable
    {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
