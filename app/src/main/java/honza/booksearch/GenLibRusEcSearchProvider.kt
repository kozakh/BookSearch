package honza.booksearch

import android.net.Uri

class GenLibRusEcSearchProvider : SearchProvider {

    val uriStart = "http://gen.lib.rus.ec/search.php?req="

    override fun GetUri(info: String):Uri {
        val uri = Uri.parse(uriStart + info)
        return uri
    }
}