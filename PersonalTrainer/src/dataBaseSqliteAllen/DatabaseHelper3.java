package dataBaseSqliteAllen;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper3 extends SQLiteOpenHelper {
    
    private static final String DATABASE_NAME = "my.db";
    private static final int DATABASE_VERSION = 1;

    // Lo statement SQL di creazione del database
    private static final String DATABASE_CREATE = "create table schedeAll (_id integer primary key autoincrement, esercizio text not null,"
    		+ " gruppo text not null, categ text not null, serie text not null, rip text not null,"
    		+ " sesso text not null, giorno text not null, date text not null,nScheda text not null,rec text not null,"
    		+ "prep text not null);";

    // Costruttore
    public DatabaseHelper3(Context context) {
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