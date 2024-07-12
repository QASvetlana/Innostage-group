# Проект по автоматизации тестирования для компании [Innostage](https://innostage-group.ru/)

## Тестовая модель:

- [x] Title главной страницы
- [x] Поле поиска
- [x] Наличие ошибок в консоле

## Используемые технологии и инструменты

IntelliJ IDEA, Java, Selenide, Selenoid, Gradle, JUnit5, Allure SE, Allure TestOps, Github, Jenkins, Telegram (reports)

# Конфигурация для запуска тестов
Параметры для запуска автотестов в удаленном браузере на билд-сервере проекта
autotests.cloud задаются в настройках job CI Jenkins в виде Choice Parameter
и передаются в код проекта через терминал как системные переменные (в фигурных скобках) с помощью следующих команд:

```bash
clean
test
-Dbrowser=${BROWSER} // запускаемый браузер
-DbrowserVersion=${BROWSER_VERSION} // версия браузера
-DbrowserSize=${BROWSER_SIZE} // размер окна браузера
-DremoteDriverUrl=https://<username>:<password>@${REMOTE_DRIVER_URL}/wd/hub/ // URL сервера, на котором запускаются тесты
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/ // URL сервера с видеофайлами выполнения тестов
-Dthreads=${THREADS} // число потоков для прогона тестов

allure serve build/allure-results Генерация отчета
```
### Для запуска автотестов на удаленной машине использован build server Jenkins

### Тестовая документация хранится в Allure TestOpts

### Отчетность генерируется с помощью Allure reports

### Интеграция с Jira 
Доступен список тест-кейсов, а так же приложен результат запуска автотестов
![image](src/files/jira1.jpg)
![image](src/files/jira2.jpg)
### Уведомления о результатах тестирования уходят в Telegram
![image](src/files/Telegram.jpg)
### Видеотчет теста "Поиск товара"
![image](src/files/Gif.gif)
