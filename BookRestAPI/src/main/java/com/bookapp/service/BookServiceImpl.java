package com.bookapp.service;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.bookapp.dao.BookDAO;
import com.bookapp.dao.BookDAOImpl;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDAO bookDAO;

 

    @Override
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

 

    @Override
    public List<Book> getByAuthor(String author)  {
        return bookDAO.getByAuthor(author);
    }

 

    @Override
    public Book getById(int id) {
        return bookDAO.getById(id) ;
    }

 

    @Override
    public List<Book> getByCategory(String category) {
        return bookDAO.getByCategory(category);
    }

 

}