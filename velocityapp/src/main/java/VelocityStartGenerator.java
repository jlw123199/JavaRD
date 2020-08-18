import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class VelocityStartGenerator {


    static String inputTemplate = "java_example.vm";
    static String className = "VelocityExample";
    static String message = "Hello World!";
    static String outputFile = className + ".java";
    static String outputFileHtml = className + ".html";
    static String outputFileSh = className + ".sh";

    public static void main ( String [ ] args ) throws IOException {
        String fileDir = VelocityStartGenerator.class.getResource("/vm").getPath();

        VelocityEngine ve = new VelocityEngine();
        Properties properties = new Properties();
        properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, fileDir); //此处的fileDir可以直接用绝对路径来//指定,如"D:/template",但记住只要指定到文件夹就行了
        ve.init(properties); //初始化

        Template templateJava = ve.getTemplate(inputTemplate);
        Template templateHtml = ve.getTemplate("http_example.vm");
        Template templateSh = ve.getTemplate("sh_example.vm");

        VelocityContext context = new VelocityContext ( ) ;
        context. put ( "className" , className ) ;
        context. put ( "message" , message ) ;

        //java
        Writer writer = new FileWriter( new File( outputFile ) ) ;
        ve.mergeTemplate ( templateJava.getName(), "UTF-8" , context, writer ) ;
        writer. flush ( ) ;
        writer. close ( ) ;
        System . out . println ( "Generated " + outputFile ) ;

        //html
        writer = new FileWriter( new File( outputFileHtml ) ) ;
        ve.mergeTemplate ( templateHtml.getName(), "UTF-8" , context, writer ) ;
        writer. flush ( ) ;
        writer. close ( ) ;
        System . out . println ( "Generated " + outputFileHtml ) ;

        //sh

        writer = new FileWriter( new File( outputFileSh ) ) ;
        ve.mergeTemplate ( templateSh.getName(), "UTF-8" , context, writer ) ;
        writer. flush ( ) ;
        writer. close ( ) ;
        System . out . println ( "Generated " + outputFileSh ) ;

    }
}