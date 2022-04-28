package lt.viko.eif.tpetrauskas.RealEstateObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private DataOutputStream dataOutputStream = null;
    private DataInputStream dataInputStream = null;
    private String fileName = "real-estate-object.xml";
    private int port = 3333;

    public void run() {
        try(ServerSocket serverSocket = new ServerSocket(port)){
            Socket clientSocket = serverSocket.accept();
            dataInputStream = new DataInputStream(clientSocket.getInputStream());
            dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());

            Thread.sleep(1000);
            receiveFile(fileName);
            System.out.println("File " + "\""  + fileName + "\""  + " received from CLIENT via port " + port + ".");

            dataInputStream.close();
            dataOutputStream.close();
            clientSocket.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void receiveFile(String fileName) throws Exception{
        int bytes = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        long size = dataInputStream.readLong();
        byte[] buffer = new byte[4*1024];
        while (size > 0 && (bytes = dataInputStream.read(buffer, 0, (int)Math.min(buffer.length, size))) != -1) {
            fileOutputStream.write(buffer,0,bytes);
            size -= bytes;
        }
        fileOutputStream.close();
    }
}