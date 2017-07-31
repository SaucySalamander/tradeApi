FROM saucysalamander/javabase:1.0
MAINTAINER Salamander
VOLUME /tmp

RUN pwd
ENV DIRPATH RUN pwd
WORKDIR $DIRPATH

ADD "build/libs/tradeApi-0.0.1-SNAPSHOT.jar" app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]