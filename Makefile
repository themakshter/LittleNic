JCC=javac
JFLAGS=-g
ANTLRJAR=antlr3_runtime.jar
CLASSPATH=-classpath .:$(ANTLRJAR)

SRCS=*.java
OBJS = $(SRCS:.java=.class)

LittleNic.class LittleNicParser.class LittleNicLexer.class ErrorReporter.class Run.class: $(SRCS)
	$(JCC) $(JFLAGS) $(CLASSPATH) *.java

help:
	java $(CLASSPATH) Run -h

run:
	java $(CLASSPATH) Run -

clean:
	rm *.class
