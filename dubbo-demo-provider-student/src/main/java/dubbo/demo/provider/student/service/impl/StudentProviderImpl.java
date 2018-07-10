package dubbo.demo.provider.student.service.impl;


import dubbo.demo.provider.student.service.StudentProvider;
import org.springframework.stereotype.Service;

@Service("studentProvider")
public class StudentProviderImpl implements StudentProvider {

	public String findById(Long id) {
		System.out.println("findById请求过来了");
		try {
			Thread.sleep(3000L);
		} catch (Exception e) { }
		return "id:" + id;
	}

	public String findList() {
		return "findList ok";
	}
}
