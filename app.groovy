@RestController
class HelloGroovy {
	
	@RequestMapping("/")
	String home() {
		"hello groovy!!!"
	}
}
