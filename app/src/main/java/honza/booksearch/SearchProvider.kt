package honza.booksearch

import android.net.Uri

interface SearchProvider {
    fun GetUri(info: String):Uri
}