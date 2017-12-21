package com.org.utillib.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;


import com.org.utillib.mode.AuthorModel;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "AUTHOR_MODEL".
*/
public class AuthorModelDao extends AbstractDao<AuthorModel, Long> {

    public static final String TABLENAME = "AUTHOR_MODEL";

    /**
     * Properties of entity AuthorModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Author_id = new Property(1, int.class, "author_id", false, "AUTHOR_ID");
        public final static Property Author_name = new Property(2, String.class, "author_name", false, "AUTHOR_NAME");
        public final static Property Author_nickname = new Property(3, String.class, "author_nickname", false, "AUTHOR_NICKNAME");
        public final static Property Author_account = new Property(4, String.class, "author_account", false, "AUTHOR_ACCOUNT");
        public final static Property Author_github = new Property(5, String.class, "author_github", false, "AUTHOR_GITHUB");
        public final static Property Author_csdn = new Property(6, String.class, "author_csdn", false, "AUTHOR_CSDN");
        public final static Property Author_websit = new Property(7, String.class, "author_websit", false, "AUTHOR_WEBSIT");
        public final static Property Author_introduction = new Property(8, String.class, "author_introduction", false, "AUTHOR_INTRODUCTION");
    }


    public AuthorModelDao(DaoConfig config) {
        super(config);
    }
    
    public AuthorModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"AUTHOR_MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"AUTHOR_ID\" INTEGER NOT NULL ," + // 1: author_id
                "\"AUTHOR_NAME\" TEXT," + // 2: author_name
                "\"AUTHOR_NICKNAME\" TEXT," + // 3: author_nickname
                "\"AUTHOR_ACCOUNT\" TEXT," + // 4: author_account
                "\"AUTHOR_GITHUB\" TEXT," + // 5: author_github
                "\"AUTHOR_CSDN\" TEXT," + // 6: author_csdn
                "\"AUTHOR_WEBSIT\" TEXT," + // 7: author_websit
                "\"AUTHOR_INTRODUCTION\" TEXT);"); // 8: author_introduction
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"AUTHOR_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AuthorModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getAuthor_id());
 
        String author_name = entity.getAuthor_name();
        if (author_name != null) {
            stmt.bindString(3, author_name);
        }
 
        String author_nickname = entity.getAuthor_nickname();
        if (author_nickname != null) {
            stmt.bindString(4, author_nickname);
        }
 
        String author_account = entity.getAuthor_account();
        if (author_account != null) {
            stmt.bindString(5, author_account);
        }
 
        String author_github = entity.getAuthor_github();
        if (author_github != null) {
            stmt.bindString(6, author_github);
        }
 
        String author_csdn = entity.getAuthor_csdn();
        if (author_csdn != null) {
            stmt.bindString(7, author_csdn);
        }
 
        String author_websit = entity.getAuthor_websit();
        if (author_websit != null) {
            stmt.bindString(8, author_websit);
        }
 
        String author_introduction = entity.getAuthor_introduction();
        if (author_introduction != null) {
            stmt.bindString(9, author_introduction);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AuthorModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getAuthor_id());
 
        String author_name = entity.getAuthor_name();
        if (author_name != null) {
            stmt.bindString(3, author_name);
        }
 
        String author_nickname = entity.getAuthor_nickname();
        if (author_nickname != null) {
            stmt.bindString(4, author_nickname);
        }
 
        String author_account = entity.getAuthor_account();
        if (author_account != null) {
            stmt.bindString(5, author_account);
        }
 
        String author_github = entity.getAuthor_github();
        if (author_github != null) {
            stmt.bindString(6, author_github);
        }
 
        String author_csdn = entity.getAuthor_csdn();
        if (author_csdn != null) {
            stmt.bindString(7, author_csdn);
        }
 
        String author_websit = entity.getAuthor_websit();
        if (author_websit != null) {
            stmt.bindString(8, author_websit);
        }
 
        String author_introduction = entity.getAuthor_introduction();
        if (author_introduction != null) {
            stmt.bindString(9, author_introduction);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public AuthorModel readEntity(Cursor cursor, int offset) {
        AuthorModel entity = new AuthorModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // author_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // author_name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author_nickname
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // author_account
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // author_github
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // author_csdn
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // author_websit
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // author_introduction
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AuthorModel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAuthor_id(cursor.getInt(offset + 1));
        entity.setAuthor_name(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor_nickname(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAuthor_account(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAuthor_github(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAuthor_csdn(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAuthor_websit(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setAuthor_introduction(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(AuthorModel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(AuthorModel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(AuthorModel entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
