import spock.lang.*
import com.cambiahealth.utils.HelloWorld

class HelloWorldCustom  extends Specification {
	
	@Shared HelloWorld hello 

	def setupSpec() {
    hello = new HelloWorld(tellIt:'Goodbye Cruel World!')
  }

	def 'test greeting'() {
    expect: 'Hello World!'
      hello.tellIt == 'Goodbye Cruel World!' 
  }

}
