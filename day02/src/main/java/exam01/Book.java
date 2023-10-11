package exam01;

public class Book {
    private String title;
    private String author;
    private String publisher;


    private Book(){}

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    static class Builder{ //내부에서 객체 생성할 수 있는 Builder 클래스
        private Book instance = new Book();


        public Builder title(String title){
          instance.title = title;
          return this; //메서드 체인
        }

        public Builder author(String author){
            instance.author = author;
            return this;
        }

        public Builder publisher(String publisher){
            instance.publisher = publisher;
            return this;
        }

        public Book build(){
            return instance;
        }
    }

}
