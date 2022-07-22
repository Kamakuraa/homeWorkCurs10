FROM eclipse-temurin:17
WORKDIR app

ADD target/train-app.jar train-app.jar

CMD java -jar application.jar