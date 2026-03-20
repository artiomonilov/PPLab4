// Library.kt
class Library {

    private val books: MutableSet<Book> = mutableSetOf()

    fun getBooks(): Set<Book> = books

    fun addBook(book: Book) {
        books.add(book)
    }

    fun findAllByAuthor(author: String): Set<Book> =
        books.filter { it.hasAuthor(author) }.toSet()

    fun findAllByName(name: String): Set<Book> =
        books.filter { it.hasTitle(name) }.toSet()

    fun findAllByPublisher(publisher: String): Set<Book> =
        books.filter { it.isPublishedBy(publisher) }.toSet()
}