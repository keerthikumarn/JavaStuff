package org.techzoo.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.techzoo.springmvc.form.Book;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addBook(Book book) {
		sessionFactory.getCurrentSession().save(book);
	}

	@Override
	public void removeBook(Integer id) {
		Book book = (Book)sessionFactory.getCurrentSession()
			.load(Book.class, id);
		if(null != book) {
			sessionFactory.getCurrentSession().delete(book);
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Book> listBooks() {
		return sessionFactory.getCurrentSession()
			.createQuery("from Book").list();
	}

	@Override
	public void updateBook(Book book) {
		sessionFactory.getCurrentSession().update(book);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public Book getBookById(Integer bookId) {
		Session session = sessionFactory.getCurrentSession();
		List<Book> list = session.createQuery("from Book b where b.id = :bookId")
			.setParameter("bookId", bookId)
			.list();
		return list.size() > 0 ?(Book)list.get(0): null;
	}

}
