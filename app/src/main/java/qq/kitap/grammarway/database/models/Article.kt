package qq.kitap.grammarway.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "book")

class Article (
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "theme")
    val theme: String,

    @ColumnInfo(name = "article")
    val article: String

)