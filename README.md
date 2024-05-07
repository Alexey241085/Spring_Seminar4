Базовое задание:
1. Создание базового веб-приложения Spring MVC
Начните с создания простого веб-приложения с использованием Spring MVC. Это может быть простой сайт, который выводит "Привет, мир!" на главной странице. Используйте аннотацию @Controller и @RequestMapping для маршрутизации запросов на эту страницу.
2. Добавление Thymeleaf в проект
Добавьте Thymeleaf в свое веб-приложение Spring MVC. Создайте простую страницу с некоторыми переменными, которые заполняются с помощью модели Spring MVC и отображаются на странице с использованием Thymeleaf.
3. Создание формы ввода и обработка данных формы
Создайте страницу с формой ввода, используя Thymeleaf для рендеринга формы. Затем создайте контроллер Spring MVC, который обрабатывает отправку формы и выводит полученные данные. Это может быть форма для регистрации или любая другая форма, которая собирает информацию от пользователя.
(Не обязательно) Добавить в HTML в тег <style> простой css код. Например изменить цвет заголовков, стиль таблицы или обернуть форму в рамочку
Все необходимые примеры кода для этого задания мы разбирали на семинаре.
_
Задание со звездочкой:
Проект домашнего задания для 2 семинара (CRUD приложение USER SERVICE) переписать:
1. Использовать библиотеку Lomboc:
a) @Data - для полей классов
b) @AllArgsConstructor - для классов с конструкторами
c) @Log - логировать работу всех контроллеров
2. Использовать configuration-processor для работы с настройками приложения:
a) Создать объект инкапсулирующий шаблоны запросов к базе данных H2
b) Использовать аннотации @ConfigurationProperties и @ConfigurationPropertiesScan для заполнения полей этого класса
с) Вынести все SQL шаблоны в настройки приложения.
