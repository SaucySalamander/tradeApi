FROM saucysalamander/javabase:1.0
MAINTAINER Salamander
RUN pwd
VOLUME /tmp

RUN pwd
ENV TESTPATH RUN pwd
WORKDIR $TESTPATH
RUN pwd
ENV BUILDDIR "build/libs/tradeApi-0.0.1-SNAPSHOT.jar"
ENV DIRPATH "/var/jenkins_home/workspace/ySalamander_tradeApi_master-VVKNHORLK3AWHDLWX2Q6P374CTHZRAEM7NGR435LFR6PK476FTTQ"

ADD $BUILDDIR app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]