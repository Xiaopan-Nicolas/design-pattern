###第一章 从面向对象到函数式编程
1. 编程范式
  - 命令式编程
    - 用语句更改程序的状态
  - 面向对象编程
    - 对象和类
      - 对象是面向对象编程(OOP)语言的主要元素，包括状态和行为。
      - 我们将类视为模板，则对象是模板的实现。
      - 面向对象基于四个基本原则：```封装、抽象、继承、多态```
    - 封装 ```对象的属性和行为的绑定```
    - 抽象 ```抽象与封装密切相关，某种程度上与封装重叠。抽象提供了一种机制，使得对象可以公开它可以做什么，而隐藏它是如何做到的```
    - 继承 ```指对象或者类基于另一个对象或类的能力。有一个基类或者父类，它为实体提供顶级行为。```
    - 多态 ```多态为我们提供了让不同类型的实体使用相同接口的选项。主要有编译时多态和运行时多态。运行时多态主要体现在子类继承父类并覆写其方法，这种编译器只有在运行时才能决定哪个方法。```
  - 声明式编程
    - 非命令式的编程都可称之为声明式编程
  - 函数式编程
    - 是声明式编程的子范式，不会改变程序的内部状态
    - 大多数函数式语言都是基于lamdba演算，是数学家20世纪30年代创建的数学逻辑系统
    - 函数式语言支持并行运行，但又不同于多线程
    
2. 流以及集合的使用
  - 示例代码 Test1 当中 page 7
3. 统一建模语言UML
  - 统一建模语言(Unified Modeling Language，UML)可以帮助我们表示软件的结构
  - 类之间的关系 ```泛化、实现、依赖、关联、聚合和组合```
  - 泛化
    - 表示对象编程中的继承关系 ```Is-A关系```
    - 当一个类表示多个类的共享特征时，称之为泛化。比如Vehicle是Bike、Car、Truck的泛化
    - 当一个类表示一般类的特殊实例时，称之为特化。Car是Vehicle的特化。
  - 实现
    - 表示对象编程中的接口实现
  - 依赖
    - 定义一个类以某种方式依赖于另一个类，而另一个类可能依赖于或者不依赖于第一个类 ```Uses-A关系```
  - 关联
    - 表示两个实体之间的关系，有聚合和组合两种关联关系。
      - 聚合
        - a. 特殊类型关联。 ```Has-A关系```
        - b. 一个类在逻辑上包含另一个类，但所包含的类又可以独立于第一个类在其上下文之外生存，或被其他类引用。比如部门和教师之间存在Has-A关系，教师必须有部门，但是部门不存在后，教师仍然处于活跃状态。
      - 组合
        - a. 一个类是另一个类的组成部分就称两者之间存在组合关系。
        - b. 与聚合不同之处在于，当主类不存在的时候，依赖类也将不存在。比如房子(House)由房间(Room)组成，房子被毁，房间亦不存在。
4.设计模式和原则