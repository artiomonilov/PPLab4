fun main() {

    val content1 = Content(
        author = "Andrei",
        text = "Nuvela",
        name = "Nume 789",
        publisher = "Publicari 1"
    )

    val content2 = Content(
        author = "Mihai",
        text = "Roman",
        name = "Nume 543",
        publisher = "Publicari 2"
    )

    val content3 = Content(
        author = "Adrian",
        text = "Poezii",
        name = "Nume 123",
        publisher = "Publicari 3"
    )


    val book1 = Book(content1)
    val book2 = Book(content2)
    val book3 = Book(content3)

    val library = Library()
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)


    val printer = LibraryPrinter()

    println("Cartile")
    printer.printBooksRaw(library.getBooks())

    println("\nCarti scrise de Autor 2")
    val carti1 = library.findAllByAuthor("Autor 2")
    printer.printBooksRaw(carti1)

    println("\nCarti cu titlul Nume 789")
    val booksByName = library.findAllByName("Nume 789")
    printer.printBooksRaw(booksByName)

    println("\nCarte publicata de Publicari 3")
    val booksByPublisher = library.findAllByPublisher("Publicari 3")
    printer.printBooksRaw(booksByPublisher)

    println("\ncodul HTML")
    printer.printHTML(library.getBooks())

    println("\ncodul JSON")
    printer.printJSON(library.getBooks())
}