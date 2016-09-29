package example.booklist

class Book {

    String title
    String shortdescription
    String isbn
    Author author

    static constraints = {
        title nullable:false
        shortdescription nullable:true
        isbn: nullable:true
    }
}
