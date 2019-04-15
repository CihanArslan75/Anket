import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/msg")
	@ResponseBody
	public String getMessage() {
		return "İlk Spring Projem";
	}

}
