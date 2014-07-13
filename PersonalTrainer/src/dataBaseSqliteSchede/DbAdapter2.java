package dataBaseSqliteSchede;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DbAdapter2 {

	private Context context;
	private SQLiteDatabase database;
	private DatabaseHelper2 dbHelper;

	// Database fields
	private static final String DATABASE_TABLE= "exSeg";

	public static final String KEY_CONTACTID = "_id";
	public static final String KEY_DAY = "day";
	public static final String KEY_ESERCIZI = "excercises";
	public static final String KEY_SERIE = "serie";
	public static final String KEY_RIP = "rip";
	public static final String KEY_PESI = "pesi";

	public DbAdapter2(Context context) {
		this.context = context;
	}

	public DbAdapter2 open() throws SQLException {
		dbHelper = new DatabaseHelper2(context);
		database = dbHelper.getWritableDatabase();
		return this;
	}

	public void close() {
		dbHelper.close();
	}

	private ContentValues createContentValues( String day, String e,String s,String r, String p) {
		ContentValues values = new ContentValues();
		values.put(KEY_DAY, day);
		values.put( KEY_ESERCIZI, e);
		values.put( KEY_SERIE, s );
		values.put( KEY_RIP, r );
		values.put( KEY_PESI, p);

		return values;
	}

	//create a contact
	public long createContact(String day, String e,String s,String r,String p) {
		ContentValues initialValues = createContentValues(day, e, s, r,p);
		return database.insertOrThrow(DATABASE_TABLE, null, initialValues);
	}

	//update a contact
	public boolean updateContact( long contactID,String day, String e,String s,String r,String p) {
		ContentValues updateValues = createContentValues( day, e, s, r,p);
		return database.update(DATABASE_TABLE, updateValues, KEY_CONTACTID + "=" + contactID, null) > 0;
	}

	//delete a contact      
	public boolean deleteContact(long contactID) {
		return database.delete(DATABASE_TABLE, KEY_CONTACTID + "=" + contactID, null) > 0;
	}

	//fetch all contacts
	public Cursor fetchAllContacts() {
		return database.query(DATABASE_TABLE, new String[] {KEY_CONTACTID,KEY_DAY,KEY_ESERCIZI,KEY_SERIE,
				KEY_RIP,KEY_PESI},null , null, null, null, null);
	}

	//fetch contacts filter by a string
	public Cursor fetchContactsByFilter(String filter) {
		Cursor mCursor = database.query(true, DATABASE_TABLE, new String[] {
				KEY_CONTACTID },
				//MI TROVA TUTTE LE SCHEDE CHE CONTENGONO FILTER
				KEY_DAY + " = '"+ filter + "'", null, null, null, null, null);

		return mCursor;
	}

	//fetch contacts filter by a string
	public Cursor fetchContactsByFilter2(String filter) {
		Cursor mCursor = database.query(true, DATABASE_TABLE, new String[] {
				KEY_DAY },
				//MI TROVA TUTTE LE SCHEDE CHE CONTENGONO FILTER
				KEY_DAY + " = '"+ filter + "'", null, null, null, null, null);

		return mCursor;
	}

	//fetch contacts filter by a string
	public Cursor fetchContactsByFilter3(String filter) {
		Cursor mCursor = database.query(true, DATABASE_TABLE, new String[] {
				KEY_ESERCIZI,KEY_SERIE,KEY_RIP,KEY_PESI },
				//MI TROVA TUTTE LE SCHEDE CHE CONTENGONO FILTER
				KEY_DAY + " = '"+ filter + "'", null, null, null, null, null);

		return mCursor;
	}
}