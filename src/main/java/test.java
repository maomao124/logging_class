import java.util.logging.Logger;

/**
 * Project name(项目名称)：记录日志类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/15
 * Time(创建时间)： 18:21
 * Version(版本): 1.0
 * Description(描述)：
 * 日志用来记录程序的运行轨迹，方便查找关键信息，也方便快速定位解决问题。
 * 如果要生成简单的日志记录，可以使用全局日志记录器并调用其 info 方法，代码如下：
 * Logger.getGlobal().info("打印信息");
 * JDK Logging 把日志分为如下表 7 个级别，等级依次降低。
 * 级别	     SEVERE	    WARNING 	INFO	CONFIG  	FINE	FINER	FINEST
 * 调用方法	severe()	warning()	info()	config()	fine()	finer()	finest()
 * 含义      	严重	     警告	    信息	    配置	         良好	   较好    	最好
 * Logger 的默认级别是 INFO，比 INFO 级别低的日志将不显示。Logger 的默认级别定义在 jre 安装目录的 lib 下面。
 * # Limit the message that are printed on the console to INFO and above.
 * java.util.logging.ConsoleHandler.level = INFO
 * 日志只显示前三个级别，对于所有的级别有下面几种记录方法：
 * logger.warning(message);
 * logger.fine(message);
 * 同时，还可以使用 log 方法指定级别，例如：
 * logger.log(Level.FINE, message);
 */

public class test
{
    private static Logger log = Logger.getLogger(test.class.toString());

    public static void main(String[] args)
    {
        log.finest("finest");
        log.finer("finer");
        log.fine("fine");
        log.config("config");
        log.info("info");
        log.warning("warning");
        log.severe("server");
    }
}
