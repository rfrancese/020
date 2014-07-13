package dataBaseSqliteSchede;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper2 extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "mydatabase3.db";
	private static final int DATABASE_VERSION = 1;

	// Lo statement SQL di creazione del database
	private static final String DATABASE_CREATE = "create table exSeg (_id integer primary key autoincrement, day text not "
			+ "null, excercises text not null, serie integer not null, rip integer not null, pesi integer not null);";

	// Costruttore
	public DatabaseHelper2(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Questo metodo viene chiamato durante la creazione del database
	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(DATABASE_CREATE);
	}

	// Questo metodo viene chiamato durante l'upgrade del database, ad esempio quando viene incrementato il numero di versione
	@Override
	public void onUpgrade( SQLiteDatabase database, int oldVersion, int newVersion ) {

		database.execSQL("DROP TABLE IF EXISTS contact");
		onCreate(database);

	}
}