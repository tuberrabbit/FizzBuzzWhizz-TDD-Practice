# FizzBuzzWhizz  

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有100名学生在上课。游戏的规则是：  

你首先说出三个不同的特殊数，要求必须是个位数，比如3、5、7。  
让所有学生拍成一队，然后按顺序报数。  
学生报数时，如果所报数字是第一个特殊数（3）的倍数，那么不能说该数字，而要说Fizz；如果所报数字是第二个特殊数（5）的倍数，那么要说Buzz；如果所报数字是第三个特殊数（7）的倍数，那么要说Whizz。  
学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如第一个特殊数和第二个特殊数的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。  
学生报数时，如果所报数字包含了第一个特殊数，那么也不能说该数字，而是要说相应的单词，比如本例中第一个特殊数是3，那么要报13的同学应该说Fizz。如果数字中包含了第一个特殊数，那么忽略规则3和规则4，比如要报35的同学只报Fizz，不报BuzzWhizz。  
  
现在，我们需要你完成一个程序来模拟这个游戏，它首先接受3个特殊数，然后输出100名学生应该报数的数或单词。比如，  

输入 3,5,7 输出（片段）  

```
  1  
  2  
  Fizz  
  4  
  Buzz  
  Fizz  
  Whizz  
  8  
  Fizz  
  Buzz  
  11  
  Fizz  
  Fizz  
  Whizz
  FizzBuzz
  16
  17
  Fizz
  19
  Buzz 
  …
```  

一直到100

## Tasks  
* 生成三个特殊数字。
* 数字是3（第一个特殊数）的倍数代表Fizz  
* 数字是5（第二个特殊数）的倍数代表Buzz  
* 数字是7（第三个特殊数）的倍数代表Whizz  
* 数字是多个特殊数的倍数要依次喊出  
* 数中包含3（第一个特殊数），就只说Fizz  
* 一直处理从1到100的数  

###task 1  
1. 假设特殊字符是3，5，7   
2. 在number是3的倍数情况下，应该返回Fizz  
3. 如果不是3的倍数，返回原数字。  

###task 2  
1. 假设特殊字符是3，5，7   
2. 在number是5的倍数情况下，应该返回Buzz  
3. 如果不是5的倍数，返回原数字。  

###task 3  
1. 假设特殊字符是3，5，7   
2. 在number是7的倍数情况下，应该返回Whizz  
3. 如果不是7的倍数，返回原数字。  

###task 4
add checkstyle & refactor test

###task 5  
1. 假设特殊字符是3，5，7   
2. 在number是3 和5 的倍数情况下，应该返回FizzBuzz  
3. 如果不是，返回原数字。  

###task 6  
1. 假设特殊字符是3，5，7   
2. 在number是3 和7 的倍数情况下，应该返回FizzWhizz  
3. 如果不是，返回原数字。  

###task 7  
1. 假设特殊字符是3，5，7   
2. 在number是5 和7 的倍数情况下，应该返回BuzzWhizz  
3. 如果不是，返回原数字。  

###task 8  
1. 假设特殊字符是3，5，7   
2. 在number是3、5 和7 的倍数情况下，应该返回FizzBuzzWhizz  
3. 如果不是，返回原数字。  

###task 9  
1. 假设特殊字符是3，5，7   
2. 在number包含3的情况下，应该返回Fizz  
3. 如果不是，返回原数字。  

###task 10
把Rule归类到新的包路径下

###task 11
生成新的工厂类RuleOwner

###task 12
rename class name

###task 13
老师说出三个特殊数字，并且生成相应的规则

###task 14
创建命令行窗口启动入口Launcher.java

###task 15
重新考虑OO设计思想
产生三个对象RuleFactory Teacher Student

###task 16
refactoring
考虑Student行为的合理性

###task 17
问题：
1. 考虑什么对象需要被mock（如：在StudentTest中的Rule需要mock吗？还有RuleFactoryTest.java中得Teacher Object）
2. 我觉得Student还是要根据Rules去判断而不是单一得Rule（栗子如：35应该是Fizz而不是BuzzWhizz）