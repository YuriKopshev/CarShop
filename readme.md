**Задача: Автосалон**
Работа программы
1. Создание потока-производителя и потока-покупателя
2. Покупатель покупает товар, если это возможно
3. С некоторой периодичностью производитель выкладывает товар на рынок

Требования к программе

1. Каждый ключевой этап должен сопровождаться выводом в консоль текущего статуса, например: Производитель Toyota выпустил 1 автомобиль
2. Все задержки (время сборки авто, таймаут желания купить машину) должны быть оформлены в константах (никаких "Магических чисел")
3. Должно быть несколько потоков-покупателей, которые будут желать несколько раз купить машину. Производитель выпускает по 1 машине. Программу можно завершать после продажи 10 машин