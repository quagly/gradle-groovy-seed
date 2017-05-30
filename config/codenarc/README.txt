rather than comment out the 0.22 rules
that I do not want for tests and main
it may be better to put a 

codenarc.properties

file in src/main/resouces

to exclude rules and make other settings.

See http://codenarc.sourceforge.net/codenarc-configuring-rules.html

ideally with a new version we could just drop all the rules here
then new rules would apply while ignores would be honored
