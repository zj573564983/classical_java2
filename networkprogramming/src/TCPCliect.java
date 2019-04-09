import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/***
 * TCP通信的客户端：向服务器发送请求，给服务器发送数据，读取服务器回写的数据
 * java中有专门这样的类：java.net.socket类实现了客户端套接字。套接字是两台机器通信的端点。
 *    套接字包含了ip地址和端口号的网络单位。
 *
 * 、构造方法 Socket(String host,int port)
 * 、成员方法：OutputStream getOutputStream返回此套接字的输出流
 *             InputStream getInputStream返回此套接字的输入流
 *             void close()关闭此套接字
 *
 * 注意：
 *      1.客户端与服务端进行交互，必须使用Socket中提供的网络流，不能使用自己创建的流对象
 *      2.当我们创建客户端对象Socket的时候，就会去请求服务器和服务器进行3次握手建立连接通路
 * @author zhangjie
 * @date 2019/4/9 8:48
 */
public class TCPCliect {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os=socket.getOutputStream();
        os.write("你好服务器".getBytes());

        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));

        os.close();
    }
}
