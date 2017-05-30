#!/bin/bash
# example of pushing groovy docs to webserver
# note that file ownership is not handled
./gradlew groovydoc
# sudo cp -fR ~/projects/talend/build/docs/* /var/www/html/
