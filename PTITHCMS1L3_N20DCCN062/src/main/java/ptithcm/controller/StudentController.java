package ptithcm.controller;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ptithcm.bean.Student;
import ptithcm.bean.majors;

@Controller
@RequestMapping("/student/")
public class StudentController {
	@RequestMapping("index")
	public String index(ModelMap model) {
		Student student = new Student("Nguyễn Văn Tèo", 9.5, "WEB");
		model.addAttribute("student", student);
		return "student2";
	}
	
//	@ModelAttribute("majors") 
//		public Map<String, String> getMajors() {
//			Map<String, String> mj = new HashMap<>();
//			mj.put("IT", "Information Technology");
//			mj.put("ML", "Multi Media");
//			mj.put("IOS", "IOS");
//			return mj;
//		}
	@ModelAttribute("majors")
		public List<majors> getMajors() {
			List<majors> majors = new ArrayList<>();
			majors.add(new majors("APP", "Ứng dụng phần mềm"));
			majors.add(new majors("ML", " Multi Media"));
			return majors;
		}
	
}
