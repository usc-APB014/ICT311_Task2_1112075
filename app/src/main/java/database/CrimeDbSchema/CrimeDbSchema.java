package database.CrimeDbSchema;

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DETAIL = "detail";
            public static final String DATE = "date";
            public static final String PLACE = "place";
            public static final String LAT = "mLat";
            public static final String LON = "mLon";
        }

    }
}
