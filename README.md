><small>
>
## Java полное руководство - Герберт Шилдт, 10-е издание, 2018 г.

[Глава 6. "Введение в классы"](https://github.com/aykononov/JavaSchildt/tree/master/Chapter06/ "Chapter06")

[Глава 7. "Подробное рассмотрение классов и методов"](https://github.com/aykononov/JavaSchildt/tree/master/Chapter07/ "Chapter07")

### Глава 8. "Наследование"

[SimpleInheritance01 - Простой пример наследования (стр. 221)](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/SimpleInheritance01.java)
><details><summary>Подробнее...</summary>
>Как только суперкласс, который определяет общие свойства объекта, будет создан, он может наследоваться для разработки специализированных классов. Каждый подкласс добавляет собственные особые характеристики. В этом и состоит вся суть наследования.
></details>
>
[DemoBoxWeight02 - Пример, где наследование применяется для расширения класса (стр. 224 - 227)](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/DemoBoxWeight02.java)
><details><summary>Подробнее...</summary>
>Если ссылочной переменной из Суперкласса присваивается ссылка на объект Подкласса, то доступ предоставляется только к указанным в ней частям объекта, определяемого в Суперклассе, потому-что Суперклассу неизвестно, что именно добавляет в него Подкласс.
></details>
>
[DemoBoxWeight03 - Вызов конструкторов Суперкласса с помощью ключевого слова super (стр. 228 - 231)](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/DemoBoxWeight03.java)
><details><summary>Подробнее...</summary>
>При вызове метода super() из Подкласса вызывается конструктор его непосредственного Суперкласса. Таким образом, метод super() всегда обращается к Суперклассу, находящемуся в иерархии непосредственно над вызывающим классом. Это справедливо даже для многоуровневой иерархии. Кроме того, вызов метода super() должен быть непременно сделан в первом операторе, выполняемом в теле конструктора Подкласса.
></details>
[ReferenceVariables04 ](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/ReferenceVariables04.java)
>Можно посмотреть и сравнить, как выглядят ссылочные переменные при клонировании объектов и копировании ссылок на объекты.
>
[DemoShipment05 - Создание многоуровневой иерархии (стр. 232 - 235)](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/DemoShipment05.java)
><details><summary>Подробнее...</summary>
>Каждый Подкласс наследует все характеристики всех его Суперклассов. Подкласс BoxWeight служит в качестве Суперкласса для создания Подкласса BoxShipment и добавляет к ним поле cost. Благодаря наследованию в классе BoxShipment можно использовать ранее определенные классы Вох и BoxWeight, добавляя только те дополнительные данные, которые требуются для его собственного специализированного применения. В этом и состоит одна из самых ценных особенностей наследования. Она позволяет использовать код повторно. Приведенный пример демонстрирует еще одну важную особенность наследования: метод super() всегда ссылается на конструктор ближайшего по иерархии Суперкласса. В методе super() из класса BoxSlipment вызывается конструктор класса BoxWeight. А в методе super() из класса BoxWeight вызывается конструктор класса Вох. Если в иерархии классов требуется передать параметры конструктору Cуперкласса, то все подклассы должны передавать эти параметры вверх по иерархии. Данное утверждение справедливо независимо от того, нуждается ли Подкласс в собственных параметрах.
></deatails>
>
[CallingConstr06 - Порядок вызова конструкторов. (стр. 235)](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/CallingConstr06.java)
><details><summary>Подробнее...</summary>
>В иерархии классов конструкторы вызываются в порядке наследования, начиная с суперкласса и кончая подклассом. Более того, этот порядок остается неизменным независимо от того, используется форма super() или нет, поскольку вызов метода super() должен быть в первом операторе, выполняемом в конструкторе подкласса. Если метод super() не вызывается, то используется конструктор по умолчанию или же конструктор без параметров из каждого суперкласса.
></details>
[OverrideMethod07 - Переопределение методов. (стр. 236 - 237)](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/OverrideMethod07.java)
><details><summary>Подробнее...</summary>
>Если в иерархии классов совпадают имена и сигнатуры типов методов из Подкласса и Суперкласса, то говорят, что метод из Подкласса переопределяет метод из Суперкласса. Когда переопределенный метод вызывается из своего Подкласса, он всегда ссылается на свой вариант, определенный в Подклассе. А вариант метода, определенный в Суперклассе, будет скрыт.
></deatails>
>
[OverloadMethod08 - Перегрузка методов. (стр. 238)](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/OverloadMethod08.java)
><details><summary>Подробнее...</summary>
>Переопределение методов выполняется только в том случае, если имена и сигнатуры типов обоих методов одинаковы. В противном случае оба метода считаются перегружаемыми.
></deatails>
>
[DynamicMethodDispatching09 - Динамическая диспетчеризация методов. (стр. 239 - 240)](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/DynamicMethodDispatching09.java)
><details><summary>Подробнее...</summary>
>Динамическая диспетчеризация методов - это механизм, с помощью которого вызов переопределенного метода разрешается во время выполнения, а не компиляции.
>
>Ссылочная переменная из Суперкласса может ссылаться на объект Подкласса. Когда переопределенный метод вызывается по ссылке на Суперкласс, нужный вариант этого метода выбирается в Java в зависимости от типа объекта, на который делается ссылка в момент вызова.
>
>В этом примере создаются один Суперкласс А и два его Подкласса В и С. В Подклассах В и С переопределяется метод callme(), объявляемый в классе А. В методе main() объявляются объекты классов А, В и С, а также переменная ref ссылки на объект типа А. Затем переменной ref присваивается по очереди ссылка на объект каждого из классов А, В и С, и по этой ссылке вызывается метод callme().
>Как следует из результата, выводимого этой программой, выполняемый вариант метода callme() определяется исходя из типа объекта, на который делается ссылка в момент вызова. Если бы выбор делался по типу ссылочной переменной ref, то выводимый результат отражал бы три вызова одного и того же метода callme() из класса А.
></deatails>
>
></small>