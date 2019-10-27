package database.CrimeDbSchema;

import android.bignerdranch.com.Crime;
import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.Date;
import java.util.UUID;

public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
}

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DATE));
        String detail = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DETAIL));
        String place = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.PLACE));
        double mLat = getDouble(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.LAT));
        double mLon = getDouble(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.LON));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setDetail(detail);
        crime.setPlace(place);
        crime.setLatitude(mLat);
        crime.setLongitude(mLon);
        return crime;
    }
}
