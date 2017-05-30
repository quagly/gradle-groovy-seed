package com.cambiahealth.utils

import groovy.transform.Canonical
import groovy.util.logging.Log4j

/**
 * HelloWorld task for testing gradle setup
 *
 * @author Michael West
 * @version 1.0
 */
@Log4j
@Canonical
class HelloWorld {
	/** what to say */
  String tellIt = 'Hello World!'
}
