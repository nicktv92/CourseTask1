# Работа №1
task 1

1. Запуск приложения, вызываются методы класса MainActivity: onCreate(), onStart() и onResume().
Затем выводится Toast.

<img src="https://github.com/nicktv92/CourseTask1/blob/master/task_1_1.jpg" /> 

2. Нажатие кнопки Назад, вызываются методы класса MainActivity: onPause(), onStop() и onDestroy(). 
При возврате в приложение вызываются методы класса MainActivity: onCreate(), onStart() и onResume(). 
Показывается всплывающее сообщение, т.к. вызван метод onCreate()

<img src="https://github.com/nicktv92/CourseTask1/blob/master/task_1_2.jpg" /> 

3. Нажатие кнопки Домой, вызываются методы класса MainActivity: onPause() и onStop(). 
При возврате в приложение вызываются методы класса MainActivity: onRestart(), onStart() и onResume().
Всплывающее сообщение не показывается, т.к. нет вызова метода onCreate()

<img src="https://github.com/nicktv92/CourseTask1/blob/master/task_1_3.jpg" /> 

4. При повороте экрана activity пересоздается, вызываются методы класса MainActivity: onPause(), onStop() и onDestroy(), 
activity уничтожается и создается новое посредством вызова методов класса MainActivity: onCreate(), onStart() и onResume().
Показывается всплывающее сообщение, т.к. вызван метод onCreate()

<img src="https://github.com/nicktv92/CourseTask1/blob/master/task_1_4.jpg" /> 
