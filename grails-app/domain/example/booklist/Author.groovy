package example.booklist

class Author {

    String lastname
    String givenname

    static constraints = {
        lastname  nullable:false
        givenname nullable:true
    }
}
