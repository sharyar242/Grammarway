package qq.kitap.grammarway.database.dao

import androidx.room.Dao
import androidx.room.Query
import qq.kitap.grammarway.database.models.Article

@Dao
interface ArticlesDao {

    @Query("SELECT * FROM book")
    fun getAllArticles(): List<Article>

    @Query("SELECT * FROM book WHERE id=:id")
    fun getArticleById(id: Int): Article
}