- 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：
      (int)23.7 == 23;        (int)-45.89f == -45
  这一点和C的是不同的
- Java的标识符和C的一样都是美元符（$）开始的， 这个C和JAVA我都没记得可以这样用
- java 中string 和null相加,      
       String nstr;  String str1 = "hello" + nstr; String str2 = "world" + null;
  结果会变成 hellonull, worldnull
