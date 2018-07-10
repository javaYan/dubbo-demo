package dubbo.demo.consumer.student.service.impl;


import dubbo.demo.consumer.student.service.StudentConsumer;
import dubbo.demo.provider.student.service.StudentProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentConsumer")
public class StudentConsumerImpl implements StudentConsumer {

	@Autowired
	private StudentProvider studentProvider;

	public String getById(Long id) {
		return studentProvider.findById(id);
	}

	public String getList() {
		return studentProvider.findList();
	}
}
