package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

//	@Override
	public void getBook(Book book ) {
		System.out.println("Мы берём книгу из UniLibrary. " + book.getName());
	}

	protected String returnBook() {
		System.out.println("Мы возвращаем книгу в UniLibrary.");
		return "OK";
	}

	public void getMagazine() {
		System.out.println("Мы берём журнал из UniLibrary.");
	}
}