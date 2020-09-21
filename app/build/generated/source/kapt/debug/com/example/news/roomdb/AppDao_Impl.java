package com.example.news.roomdb;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.news.main.Repo;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRoomModel;

  private final PapersConverter __papersConverter = new PapersConverter();

  private final SharedSQLiteStatement __preparedStmtOfDeleteRoomHeadlines;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoomModel = new EntityInsertionAdapter<RoomModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `paperss_table`(`id`,`roomCountryCode`,`roomHeadlinesList`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getRoomCountryCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRoomCountryCode());
        }
        final String _tmp;
        _tmp = __papersConverter.fromPapers(value.getRoomHeadlinesList());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
    this.__preparedStmtOfDeleteRoomHeadlines = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM paperss_table WHERE roomCountryCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM paperss_table";
        return _query;
      }
    };
  }

  @Override
  public void addHeadlines(RoomModel papers) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRoomModel.insert(papers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRoomHeadlines(String roomCountryCode) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRoomHeadlines.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (roomCountryCode == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, roomCountryCode);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRoomHeadlines.release(_stmt);
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<RoomModel> getHeadlines(String roomCountryCode) {
    final String _sql = "SELECT * FROM paperss_table WHERE roomCountryCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (roomCountryCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, roomCountryCode);
    }
    return new ComputableLiveData<RoomModel>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected RoomModel compute() {
        if (_observer == null) {
          _observer = new Observer("paperss_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfRoomCountryCode = _cursor.getColumnIndexOrThrow("roomCountryCode");
          final int _cursorIndexOfRoomHeadlinesList = _cursor.getColumnIndexOrThrow("roomHeadlinesList");
          final RoomModel _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpRoomCountryCode;
            _tmpRoomCountryCode = _cursor.getString(_cursorIndexOfRoomCountryCode);
            final List<Repo> _tmpRoomHeadlinesList;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfRoomHeadlinesList);
            _tmpRoomHeadlinesList = __papersConverter.toPapers(_tmp);
            _result = new RoomModel(_tmpId,_tmpRoomCountryCode,_tmpRoomHeadlinesList);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
