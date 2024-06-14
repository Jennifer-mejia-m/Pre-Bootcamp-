package com.bean.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bean.books.models.Book;
import com.bean.books.repositories.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //devuelve todos los libros//
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    //crear un libro
    public Book createBook (Book b) {
        return bookRepository.save(b);
    }

    //actualizar un id

    public Book updateBook (Book book) {
        return bookRepository.save(book);
    }

    //recupera un libro
    public Book findBook(Long id){
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    //borrar un libro
   public void deleteBook(Long id) {
    bookRepository.deleteById(id);
   }
    
}
