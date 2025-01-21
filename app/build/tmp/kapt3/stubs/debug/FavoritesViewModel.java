
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"LFavoritesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_favoriteProducts", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "LProduct;", "db", "Lsree/ddukk/sreeprodapp/Database/AppDatabase;", "favoriteProductDao", "Lsree/ddukk/sreeprodapp/Database/FavoriteProductDao;", "favoriteProducts", "", "getFavoriteProducts", "()Ljava/util/List;", "entityToProduct", "entity", "Lsree/ddukk/sreeprodapp/DataModel/FavoriteProductEntity;", "isFavorite", "", "product", "productToEntity", "toggleFavorite", "", "app_debug"})
public final class FavoritesViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final sree.ddukk.sreeprodapp.Database.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final sree.ddukk.sreeprodapp.Database.FavoriteProductDao favoriteProductDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.snapshots.SnapshotStateList<Product> _favoriteProducts = null;
    
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Product> getFavoriteProducts() {
        return null;
    }
    
    public final boolean isFavorite(@org.jetbrains.annotations.NotNull()
    Product product) {
        return false;
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull()
    Product product) {
    }
    
    private final sree.ddukk.sreeprodapp.DataModel.FavoriteProductEntity productToEntity(Product product) {
        return null;
    }
    
    private final Product entityToProduct(sree.ddukk.sreeprodapp.DataModel.FavoriteProductEntity entity) {
        return null;
    }
}