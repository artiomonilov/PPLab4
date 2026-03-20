class Book (private val content: Content) {
    override fun toString(): String {
        return "Book(name=${content.getName()}, author=${content.getAuthor()}, publisher=${content.getPublisher()})"
    }

    fun getName(): String = content.getName()

    fun getAuthor(): String = content.getAuthor()

    fun getPublisher(): String = content.getPublisher()

    fun getContent(): String = content.getText()

    fun hasAuthor(author: String): Boolean =
        content.getAuthor().equals(author, ignoreCase = true)

    fun hasTitle(title: String): Boolean =
        content.getName().equals(title, ignoreCase = true)

    fun isPublishedBy(publisher: String): Boolean =
        content.getPublisher().equals(publisher, ignoreCase = true)
}