package Q7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args) {
			
			ApplicationContext contex=new ClassPathXmlApplicationContext("NewFile.xml");
			Array1 arr1=(Array1) contex.getBean("array1");
			
			//Array2 arr2=(Array2) contex.getBean("array2");
			
			arr1.merge();
		}
}
