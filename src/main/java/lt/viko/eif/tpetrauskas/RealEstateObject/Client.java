package lt.viko.eif.tpetrauskas.RealEstateObject;

import java.io.*;
import java.net.Socket;

public class Client{
    private DataOutputStream dataOutputStream = null;
    private DataInputStream dataInputStream = null;

    public void run() {
        try(Socket socket = new Socket("localhost",5000)) {
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

            sendFile("path/to/file1.pdf");

            dataInputStream.close();
            dataInputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void sendFile(String path) throws Exception{
        int bytes = 0;
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);

        // send file size
        dataOutputStream.writeLong(file.length());
        // break file into chunks
        byte[] buffer = new byte[4 * 1024];
        while ((bytes = fileInputStream.read(buffer)) != -1){
            dataOutputStream.write(buffer,0, bytes);
            dataOutputStream.flush();
        }
        fileInputStream.close();
    }
}