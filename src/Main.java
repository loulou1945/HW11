public class Main {
    public static void main(String[] args) {
        Book charlesDickens = new Book("The old curiosity shop", new Author("Charles","Dickens"), 1840);
        Book viktorHugo = new Book("Ninety-three",new Author("Victor","Hugo"),1874);

        Author pushkin = new Author("Aleksandr","Pushkin");
        Author lev = new Author("Lev","Tolstoy");

        charlesDickens.setPublishingYear(1841);
    }
}
