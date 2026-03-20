// LibraryPrinter.kt
import com.google.gson.Gson

class LibraryPrinter {

    fun printBooksRaw(books: Set<Book>) {
        books.forEach { println(it.toString()) }
    }

    fun printHTML(books: Set<Book>) {
        println("<html>")
        println("<body>")
        books.forEach {
            println("<p>${it.toString()}</p>")
        }
        println("</body>")
        println("</html>")
    }

    fun printJSON(books: Set<Book>) {
        val gson = Gson()
        println(gson.toJson(books))
    }
}