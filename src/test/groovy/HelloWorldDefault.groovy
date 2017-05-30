import spock.lang.*
import com.cambiahealth.utils.HelloWorld

class HelloWorldDefault  extends Specification {
	
	@Shared HelloWorld hello 

	def setupSpec() {
    hello = new HelloWorld()
  }

	def 'test greeting'() {
    expect: 'Hello World!'
      hello.tellIt == 'Hello World!' 
  }

}
