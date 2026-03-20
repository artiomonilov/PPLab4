class Content (
    private var author: String,
    private var text: String,
    private var name: String,
    private var publisher: String,
    private var price: Number
)
{
    fun getPrice():Number = price
    fun setPrice(price: Number) {
        this.price = price
    }

    fun getAuthor(): String = author
    fun setAuthor(author: String) {
        this.author = author
    }

    fun getText(): String = text
    fun setText(text: String) {
        this.text = text
    }

    fun getName(): String = name
    fun setName(name: String){
        this.name = name
    }

    fun getPublisher(): String = publisher
    fun setPublisher(publisher: String) {
        this.publisher = publisher
    }

}