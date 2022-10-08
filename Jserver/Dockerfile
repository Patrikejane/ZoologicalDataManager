FROM gradle:7.5-jdk8 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:8-alpine
RUN mkdir /usr/app/
COPY --from=build /home/gradle/src/build/libs/ZoologicalDataManager-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app
RUN sh -c 'touch ZoologicalDataManager-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","ZoologicalDataManager-0.0.1-SNAPSHOT.jar"]