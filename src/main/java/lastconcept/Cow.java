package lastconcept;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cow implements Animal{

	public void sound() {
		System.out.println("MOAOOOOOOOOOOOOOWWWWW");
		
	}

}
