package co.jinho.proj.survey.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.jinho.proj.survey.vo.AnsweredDataVO;
import co.jinho.proj.survey.vo.QuestionVO;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	@GetMapping
	public String form(Model model) {
		List<QuestionVO> questions = creatQuestionsVO();
		model.addAttribute("questions",questions);
		return "survey/surveyForm";
	}
	
	public List<QuestionVO> creatQuestionsVO(){
		QuestionVO q1 = new QuestionVO("당신의 역할은 무엇입니까?", Arrays.asList("서버","프론트","풀스텍"));
		QuestionVO q2 = new QuestionVO("많이 사용하는 개발도구는 무엇입니까?", Arrays.asList("이클립스","인텔리J","서브라임"));
		QuestionVO q3 = new QuestionVO("하고싶은 말을 적어주세요");
		return Arrays.asList(q1,q2,q3);
	}
	
	
	@PostMapping
//	public String submit(@ModelAttribute("ansDate") AnsweredDataVO data) {
	public String submit(AnsweredDataVO data, Model model) {
		//db저장 루틴
		model.addAttribute("ansData",data);
		return "survey/submitted";
	}
	
}
