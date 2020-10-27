package com.bookapp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookapp.dao.BookRepos;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepos bookRepository;
    @Override
    public Book addBook(Book book) {
        Book newbook =bookRepository.save(book);
        
        return newbook;
    }

 

    @Override
    public boolean deleteBook(Integer bookId)  {
        bookRepository.deleteById(bookId);
        return true;
    }

 

    @Override
    public Book getBookById(Integer bookId)  {
        Book book=bookRepository.findById(bookId)
        .orElseThrow(()->new BookNotFoundException("Id not available"));
        return null;
        
    }      

 

    @Override
    public Book updateBook(Book book) {
        
        return bookRepository.save(book);
    }

 

    @Override
    public List<Book> getAllBooks() {
        
        return bookRepository.findAll();
    }

 

    @Override
    public List<Book> getBookbyAuthor(String author)  {
        // TODO Auto-generated method stub
        return bookRepository.findByAuthor(author);
    }

 

    @Override
    public List<Book> getBookByCategory(String category)  {
        // TODO Auto-generated method stub
        return  bookRepository.findByCategoryOrderByTitleAsc(category);
        
    }

 

    @Override
    public List<Book> findByTitleAndAuthor(String title, String author) {
        // TODO Auto-generated method stub
        return  bookRepository.findByTitleAndAuthor(title,author);
    }

 

    @Override
    public List<Book> findBooksByTitleAndPrice(String title, Double price) {
        // TODO Auto-generated method stub
        return bookRepository.findBooksByTitleAndPrice(title, price);
    }



	@Override
	public List<Book> getBookbycategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Book> findBooksByTitleAndPrice(String title, String price) {
		// TODO Auto-generated method stub
		return null;
	}
    
    
    

 

}