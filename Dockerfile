FROM saucysalamander/javabase:1.0
MAINTAINER Salamander
VOLUME /tmp

ENV BUILDDIR "build/libs/tradeApi-0.0.1-SNAPSHOT.jar"

ADD $BUILDDIR app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]