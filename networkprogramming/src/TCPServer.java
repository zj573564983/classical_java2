import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/***
 * TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据
 * java.net.ServerSocket实现了服务器套接字
 * 构造方法：ServerSocket(int port)
 * 服务器必须明确一件事情，必须知道是哪个客户端请求的服务器
 * 这里可以使用accept方法获取到请求的客户端对象socket。Socket accept()
 *
 *
 * @author zhangjie
 * @date 2019/4/9 8:58
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        InputStream is=socket.getInputStream();

        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream os=socket.getOutputStream();
        os.write("受到谢谢".getBytes());

        socket.close();
        server.close();
    }
}
