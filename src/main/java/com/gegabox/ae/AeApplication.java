package com.gegabox.ae;

//import com.gegabox.ae.config.DotenvConfig;
import com.gegabox.ae.controller.BookController;
import com.gegabox.ae.models.Book;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AeApplication/* implements CommandLineRunner*/{
    private static final String BASE_URL = "http://localhost:8080/api/v1/books";
//    Dotenv dotenv = Dotenv
//            .configure()
//            .directory("C:\\Users\\USER\\IdeaProjects\\EA\\lesson9\\demo\\ae\\.env")
//            .ignoreIfMissing()
//            .load();

    public static void main(String[] args) {
        SpringApplication.run(AeApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        RestTemplate restTemplate = new RestTemplate();
//
//        // add book
//        Book newBook = new Book("1234567890", "John Doe", "Spring Boot Guide", 39.99);
//        ResponseEntity<Book> addResponse = restTemplate.postForEntity(BASE_URL , newBook, Book.class);
//        System.out.println("Add Response: " + addResponse.getBody());
//
//        // get book
//        ResponseEntity<Book> getResponse = restTemplate.getForEntity(BASE_URL + "/1", Book.class);
//        System.out.println("Get Response: " + getResponse.getBody());
//
//        // update book
//        Book updatedBook = new Book("1234567890", "John Doe", "Spring Boot Guide", 49.99);
//        restTemplate.put(BASE_URL + "/2", updatedBook);
//
//        // delete book
//        restTemplate.delete(BASE_URL + "/3");
//
//        // get books
//        ResponseEntity<BookController.Books> getBooksResponse = restTemplate.getForEntity(BASE_URL, BookController.Books.class);
//        System.out.println("Get Books Response: " + getBooksResponse.getBody());
//
//    }
}
