package dataBaseSqliteAllen;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
 
public class DbAdapter3 {

         
  private Context context;
  private SQLiteDatabase database;
  private DatabaseHelper3 dbHelper;
 
  // Database fields
  private static final String DATABASE_TABLE= "schedeAll";
 
  public static final String KEY_CONTACTID = "_id";
  public static final String KEY_ESERCIZI = "esercizio";
  public static final String KEY_GRUPPO = "gruppo";
  public static final String KEY_CATEGORIA = "categ";
  public static final String KEY_SERIE = "serie";
  public static final String KEY_RIPETIZIONI = "rip";
  public static final String KEY_SESSO = "sesso";
  public static final String KEY_GIORNO= "giorno";
  public static final String KEY_DATA = "date";
  public static final String KEY_N_SCHEDA = "nScheda";
  public static final String KEY_RECUPERO = "rec";
  public static final String KEY_PREP = "prep";
 
  public DbAdapter3(Context context) {
    this.context = context;
  }
 
  public DbAdapter3 open() throws SQLException {
    dbHelper = new DatabaseHelper3(context);
    database = dbHelper.getWritableDatabase();
    return this;
  }
 
  public void close() {
    dbHelper.close();
  }
 
  private ContentValues createContentValues( String ex,  String gr,  String cat,  String s,  String r,  String sex,  String gg,
		  String date, String n,String rec, String prep) {
    ContentValues values = new ContentValues();
    values.put( KEY_ESERCIZI, ex );
    values.put( KEY_GRUPPO, gr);
    values.put( KEY_CATEGORIA, cat );
    values.put( KEY_SERIE, s );
    values.put( KEY_RIPETIZIONI, r );
    values.put( KEY_SESSO, sex );
    values.put( KEY_GIORNO, gg );
    values.put( KEY_DATA, date );
    values.put( KEY_N_SCHEDA, n );
    values.put( KEY_RECUPERO, rec);
    values.put( KEY_PREP, prep);
     
   return values;
  }
         
  //create a contact
  public long createContact( String ex,  String gr,  String cat,  String s,  String r,  String sex,  String gg, String date,String n,
		  String rec, String prep) {
    ContentValues initialValues = createContentValues(ex, gr, cat, s, r, sex,  gg, date,n,rec,prep );
    return database.insertOrThrow(DATABASE_TABLE, null, initialValues);
  }
 
  //update a contact
  public boolean updateContact( long contactID, String ex, String gr,  String cat,  String s,  String r,  String sex,  
		  String gg, String date, String n,String rec, String prep) {
    ContentValues updateValues = createContentValues( ex, gr, cat, s, r, sex, gg, date,n,rec,prep);
    return database.update(DATABASE_TABLE, updateValues, KEY_CONTACTID + "=" + contactID, null) > 0;
  }
                 
  //delete a contact      
  public boolean deleteContact(long contactID) {
    return database.delete(DATABASE_TABLE, KEY_CONTACTID + "=" + contactID, null) > 0;
  }
 
  //fetch all contacts
  public Cursor fetchAllContacts() {
    return database.query(DATABASE_TABLE, new String[] {KEY_CONTACTID,KEY_GRUPPO,KEY_ESERCIZI},null , null, null, null, null);
  }
  //fetch all contacts
  public Cursor fetchContacts() {
    return database.query(DATABASE_TABLE, new String[] {KEY_GRUPPO,KEY_ESERCIZI,
    		KEY_SERIE,KEY_RIPETIZIONI,KEY_N_SCHEDA,KEY_RECUPERO},null , null, null, null, null);
  }
   
  //fetch contacts filter by a string
  public Cursor fetchContactsByFilter(String obiettivo,String sesso,String preparazione,String giorno) {
    Cursor mCursor = database.query(true, DATABASE_TABLE, new String[] {
    		 KEY_GRUPPO,KEY_ESERCIZI,KEY_SERIE,KEY_RIPETIZIONI,KEY_RECUPERO },
    		     //MI TROVA TUTTE LE SCHEDE CHE CONTENGONO FILTER
    		         KEY_CATEGORIA + " = '"+ obiettivo + "'" + " AND " +KEY_SESSO + " = '"+ sesso + "'"
    		         + " AND " +KEY_PREP + " = '"+ preparazione + "'" + " AND " +KEY_GIORNO + " = '"+ giorno + "'", 
    		         null, null, null, null, null);
         
    return mCursor;
    
  }
 
  
}