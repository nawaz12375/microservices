#Start with a base image containing Java runtime
FROM amazoncorretto:17.0.7-alpine

# MAINTAINER instruction is deprecated in favor of using label
# MAINTAINER eazybytes.com
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="nawaz"

# Add the application's jar to the image
COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java",  "-jar", "account-0.0.1-SNAPSHOT.jar"]