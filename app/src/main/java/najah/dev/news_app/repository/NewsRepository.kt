package najah.dev.news_app.repository

import najah.dev.news_app.api.RetrofitInstance
import najah.dev.news_app.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}