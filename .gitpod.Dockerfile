FROM gitpod/workspace-full

USER gitpod

# Install custom tools, runtime, etc. using apt-get
# For example, the command below would install "bastet" - a command line tetris clone:
#
# RUN sudo apt-get -q update && \
#     sudo apt-get install -yq bastet && \
#     sudo rm -rf /var/lib/apt/lists/*
#
# More information: https://www.gitpod.io/docs/config-docker/
FROM openjdk:13-alpine
VOLUME /tmp
ADD target/otp-service.jar app.jar
ENV JAVA_OPTS="-Xms64m -Xmx128m --enable-preview -XX:+AllowRedefinitionToAddDeleteMethods"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
