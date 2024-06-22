package com.bean.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.books.models.Book;
import com.bean.books.services.BookService;

import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/books")
public class BookApi {
    
    private final BookService bookService;

    public BookApi(BookService bookService) {
        this.bookService = bookService;
    }

@GetMapping("")
    public List<Book> index() {
        return bookService.allBooks();
    }

@PostMapping("")
    public Book create(@RequestParam(value="title") String title,
    @RequestParam(value="description")String desc, @RequestParam(value="language")String language,
    @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, language, numOfPages);
        return bookService.createBook(book);
    }

@GetMapping("/{id}")
    public Book show(@PathVariable("id")Long id) {
        return bookService.findBook(id);
    }

@PutMapping("/{id}")
public Book update(@PathVariable ("id")Long id,
    @RequestParam(value="title") String title,
    @RequestParam(value="description") String desc, @RequestParam(value="language") String language,
    @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, language, numOfPages);    
        book.setId(id);
    return bookService.updateBook(book);
    }

@DeleteMapping("/{id}")
public void deleteBook(@PathVariable("id")Long id) {
    bookService.deleteBook(id);
    }

@PostMapping("/inicio")
public boolean validar(@RequestParam(value="clave1")String clave1,
    @RequestParam(value="clave2")String clave2) {
    if (clave1.equals(clave2)) {
        return true;
    }else{
        return false;
    }
}
    
    

}
