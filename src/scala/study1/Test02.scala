package study1

class Test02 {

  def main(args: Array[String]): Unit = {
    /*1.scala中的基本数据类型*/
    /*
    * Byte Short Int Long Char String Float Double Boolean
    */
    //整数类型变量定义
    val x =0x29//十六进制
    val y=41//十进制
//    val z =01

    //浮点类型变量定义
    val doubleNumber = 3.1415926
    val floatNumber = 3.14159926F
    val floatNumberE = 0.315e1//直属表示法

    //字符串变量定义
    val charLiteral ='A'
    val helloWorld = "Hello World"
    val helloWorldDoubleQuote="\"HelloWorld\""
    println("""hello world""")//字符串包裹

    //特殊字符串包括
    //\n 换行符 \转义字符 \t 制表符 \b回退符

    //布尔类型定义
    val bl = true

    //scala
    var sumValue= 1 +2
    var sumValue2 =(1).+(2)

    //操作符重载
    val longSum = 1+2L
    //上面的操作等价于 1+2L

    val decrease = 1-3

    val dev = 1/3

    val mod = 1%3

    val multi = 1L*3L

    val sp = 1+ -3

    //关系运算符
    var boolean = 3 > -3

    boolean = 3 < -3

    boolean = 3<= -3

    boolean = 3 >= -3

    boolean = !(3 == -1)

    //逻辑运算符
    boolean  = true

    boolean = boolean && boolean

    boolean = boolean || boolean

    boolean =boolean || !boolean

    //位运算符
    var intx = 1 &2

    intx = 1 |2

    intx = 1^3

    intx = ~1

    intx = 6 <<1

    intx = 6 >>1

    intx = -1 >>> 31

    //对象的比较 java比较的是对象的引用 scala比较的是对象的内容
    boolean = 1==1

    boolean = 1==1.0

    boolean = "Hello" == "Hello"

    //scala程序控制结构
    val xx = if("Hello"=="Hello") 1 else 0

    var line = ""

    do{
      line = readLine();
      print("read"+line)
    }while(line!="")

    //使用if替代while循环可以减少var变量的使用

    //注意以下的写法是错误的 因为scala中赋值返回的shi Unit ""是字符串
//    while((line=readLine()) != ""){}

    val filesHere = (new java.io.File(".")).listFiles()

    for(file <- filesHere){
      print(file)
    }

    print( 1 to 5)

    for(i <- 1 to 5)print(i)

    for (i <- 1 until  5)print(i)

    for(file <- filesHere if file.getName.endsWith(".scala"))print(file)
  }

  def gcdLoop(x:Long,y:Long):Long ={
    var a=x
    var b =y
    while (a!=0){
      val temp =a
      a=b%a
      b=temp
    }
    b
  }

  def gcd(x:Long,y:Long):Long=if(y==0)x else gcd(y,x%y)

  //双重for循环
  def grep(pattern:String)={
    for (i<- 1 to 6 ){
      if(i <= 3){
        for (j <- 2 to 6){
          print(j)
        }
      }
      print(i)
    }
  }
}
