package hello

import org.springframework.boot.SpringApplication
import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam}
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
//@RequestMapping(Array("/greeting"))
class HelloController () {
	
  //@RequestMapping(method=Array(RequestMethod.GET))
  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @ResponseBody 
  def hello(@RequestParam(value= "name", required=false, defaultValue="World") name:String): Greeting = {
  	val g = new Greeting()
  	g.id = 1
  	g.content = "hello " + name
	return g
  }

}

