package sree.ddukk.sreeprodapp.Database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import sree.ddukk.sreeprodapp.DataModel.FavoriteProductEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteProductDao_Impl implements FavoriteProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteProductEntity> __insertionAdapterOfFavoriteProductEntity;

  private final EntityDeletionOrUpdateAdapter<FavoriteProductEntity> __deletionAdapterOfFavoriteProductEntity;

  public FavoriteProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteProductEntity = new EntityInsertionAdapter<FavoriteProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_products` (`id`,`name`,`imageRes`,`discountedPrice`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteProductEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getImageRes());
        stmt.bindDouble(4, value.getDiscountedPrice());
      }
    };
    this.__deletionAdapterOfFavoriteProductEntity = new EntityDeletionOrUpdateAdapter<FavoriteProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favorite_products` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteProductEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
  }

  @Override
  public void addFavorite(final FavoriteProductEntity product) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavoriteProductEntity.insert(product);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void removeFavorite(final FavoriteProductEntity product) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFavoriteProductEntity.handle(product);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<FavoriteProductEntity> getAllFavorites() {
    final String _sql = "SELECT * FROM favorite_products";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImageRes = CursorUtil.getColumnIndexOrThrow(_cursor, "imageRes");
      final int _cursorIndexOfDiscountedPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "discountedPrice");
      final List<FavoriteProductEntity> _result = new ArrayList<FavoriteProductEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FavoriteProductEntity _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final int _tmpImageRes;
        _tmpImageRes = _cursor.getInt(_cursorIndexOfImageRes);
        final double _tmpDiscountedPrice;
        _tmpDiscountedPrice = _cursor.getDouble(_cursorIndexOfDiscountedPrice);
        _item = new FavoriteProductEntity(_tmpId,_tmpName,_tmpImageRes,_tmpDiscountedPrice);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
