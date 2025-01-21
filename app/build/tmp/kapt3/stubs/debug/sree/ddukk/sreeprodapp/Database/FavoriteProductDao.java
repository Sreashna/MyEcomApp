package sree.ddukk.sreeprodapp.Database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\t"}, d2 = {"Lsree/ddukk/sreeprodapp/Database/FavoriteProductDao;", "", "addFavorite", "", "product", "Lsree/ddukk/sreeprodapp/DataModel/FavoriteProductEntity;", "getAllFavorites", "", "removeFavorite", "app_debug"})
@androidx.room.Dao()
public abstract interface FavoriteProductDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void addFavorite(@org.jetbrains.annotations.NotNull()
    sree.ddukk.sreeprodapp.DataModel.FavoriteProductEntity product);
    
    @androidx.room.Delete()
    public abstract void removeFavorite(@org.jetbrains.annotations.NotNull()
    sree.ddukk.sreeprodapp.DataModel.FavoriteProductEntity product);
    
    @androidx.room.Query(value = "SELECT * FROM favorite_products")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<sree.ddukk.sreeprodapp.DataModel.FavoriteProductEntity> getAllFavorites();
}