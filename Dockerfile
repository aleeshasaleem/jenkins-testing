FROM mcr.microsoft.com/playwright/java:v1.56.0-noble 
WORKDIR /app 
COPY . . 
RUN mvn -version 
RUN mvn clean compile 
CMD ["mvn", "exec:java", "-Dexec.mainClass=playwrightexam.docker.App"] 