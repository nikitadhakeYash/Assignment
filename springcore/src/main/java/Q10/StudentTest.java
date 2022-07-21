package Q10;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		Student studmap = (Student) context.getBean("stu11");

		Map<String, Float> map = studmap.getStuddetails();
		System.out.println("original student data:");
		System.out.println(map);

		// sort the list
		List<Map.Entry<String, Float>> sortedlist = map.entrySet().stream()
				.sorted((e1, e2) -> Float.compare(e1.getValue(), e2.getValue())).collect(Collectors.toList());
		System.out.println("sorted Student data: ");
		System.out.println(sortedlist);

	}
}
