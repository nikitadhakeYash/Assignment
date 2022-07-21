package Q2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AvgTest {
	
public static void main(String[] args) {
		

		ApplicationContext co=new ClassPathXmlApplicationContext("NewFile.xml");
		
		AvgNum avg=(AvgNum)co.getBean("ave");
		
		
		avg.show();
	}
}
