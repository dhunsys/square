FROM openjdk:7
WORKDIR /usr/src/myapp
COPY . /usr/src/myapp
RUN javac Square.java
CMD ["java", "Square","5"]
