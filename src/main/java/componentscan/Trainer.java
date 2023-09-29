package componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trainer {
	@Value("1")
	private int id;
	@Value("Poojitha")
	private String name;
	@Value("Advancejava")
	private String subject;
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
}
