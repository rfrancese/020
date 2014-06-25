package dataBaseSqliteDate;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
 
public class DbAdapter {
  @SuppressWarnings("unused")
  private static final String LOG_TAG = DbAdapter.class.getSimpleName();
         
  private Context context;
  private SQLiteDatabase database;
  private DatabaseHelper dbHelper;
 
  // Database fields
  private static final String DATABASE_TABLE= "exSvolti";
 
  public static final String KEY_CONTACTID = "_id";
  public static final String KEY_ESERCIZI = "excercises";
  public static final String KEY_DATA = "date";

 
  public DbAdapter(Context context) {
    this.context = context;
  }
 
  public DbAdapter open() throws SQLException {
    dbHelper = new DatabaseHelper(context);
    database = dbHelper.getWritableDatabase();
    return this;
  }
 
  public void close() {
    dbHelper.close();
  }
 
  private ContentValues createContentValues( String r,  String date ) {
    ContentValues values = new ContentValues();
    values.put( KEY_ESERCIZI, r );
    values.put( KEY_DATA, date );
    
     
   return values;
  }
         
  //create a contact
  public long createContact( String r,  String date  ) {
    ContentValues initialValues = createContentValues(r, date);
    return database.insertOrThrow(DATABASE_TABLE, null, initialValues);
  }
 
  //update a contact
  public boolean updateContact( long contactID, String r,  String date ) {
    ContentValues updateValues = createContentValues( r,  date);
    return database.update(DATABASE_TABLE, updateValues, KEY_CONTACTID + "=" + contactID, null) > 0;
  }
                 
  //delete a contact      
  public boolean deleteContact(long contactID) {
    return database.delete(DATABASE_TABLE, KEY_CONTACTID + "=" + contactID, null) > 0;
  }
 
  //fetch all contacts
  public Cursor fetchAllContacts() {
    return database.query(DATABASE_TABLE, new String[] {KEY_CONTACTID,KEY_ESERCIZI,KEY_DATA},null , null, null, null, null);
  }
   
  //fetch contacts filter by a string
  public Cursor fetchContactsByFilter(String filter) {
    Cursor mCursor = database.query(true, DATABASE_TABLE, new String[] {
    		     KEY_ESERCIZI },
    		     //MI TROVA TUTTE LE SCHEDE CHE CONTENGONO FILTER
    		         KEY_DATA + " = '"+ filter + "'", null, null, null, null, null);
         
    return mCursor;
  }
}