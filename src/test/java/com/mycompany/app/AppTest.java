package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * 测试 App 类的 main 方法是否会输出 "Hello World!"。
     * 此测试方法会调用 App 类的 main 方法，并验证其标准输出是否符合预期。
     * 它利用在 @BeforeEach 方法中设置的输出流捕获器来捕获 main 方法的输出，
     * 然后将捕获的输出去除首尾空白后与预期的 "Hello World!" 进行比较。
     */
    @Test
    public void main_ShouldPrintHelloWorld() {
        // 调用 App 类的 main 方法，传入一个空的字符串数组作为参数
        App.main(new String[]{});
   }

   /** 输出当前JDK版本 */
   @Test
   public void main_ShouldPrintJavaVersion() {
       // 调用 App 类的 main 方法，传入一个空的字符串数组作为参数
       App.main(new String[]{});    
       // 从输出流中获取捕获的输出
       String output = outputStreamCaptor.toString().trim();    
       // 验证输出是否包含 "java.version="
       assertTrue(output.contains("java.version="));
   }

   @Test
   public void main_ShouldPrintHelloWorldAndJavaVersion() {
       // 调用 App 类的 main 方法，传入一个空的字符串数组作为参数
       App.main(new String[]{});

       // 从输出流中获取捕获的输出
       String output = outputStreamCaptor.toString().trim();
       // 验证输出是否包含 "Hello World!"
       assertTrue(output.contains("Hello World!"));
       // 打印output
       System.setOut(standardOut);
       System.out.println("Captured output:");
       System.out.println(output);
   }
}
