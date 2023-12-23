# Базовый образ, содержащий Java 17, на основе которого будет создан наш собственный образ
FROM openjdk:17-oracle

# Директория приложения внутри контейнера, все последующие инструкции будут выполняться в указанной директории
WORKDIR /app

# Копирование JAR-файла приложения в контейнер и переименование его в "app.jar
COPY target/students-registrar-0.0.1-SNAPSHOT.jar app.jar
# Копирование default-файла со списком студентов в контейнер
COPY src/main/resources/default-students.txt  src/main/resources/default-students.txt

# Команда для запуска приложения
CMD ["java", "-jar", "app.jar"]