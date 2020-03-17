package ctsspring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController
{
@RequestMapping("/test")
public String sendMessage()
{
return "test";
}

}

