package lt.viko.eif.tpetrauskas.RealEstateObject;

import java.io.*;
import java.net.Socket;

public class Client{
    private DataOutputStream dataOutputStream = null;
    private DataInputStream dataInputStream = null;
    private String fileName = "real-estate-object.xml";
    private int port = 3333;

    public void run() {
        try(Socket socket = new Socket("localhost",port)) {
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

            sendFile(fileName);
            System.out.println("File " + "\""  + fileName + "\"" + " sent from CLIENT via port " + port + ".");

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

        dataOutputStream.writeLong(file.length());
        byte[] buffer = new byte[4 * 1024];
        while ((bytes = fileInputStream.read(buffer)) != -1){
            dataOutputStream.write(buffer,0, bytes);
            dataOutputStream.flush();
        }
        fileInputStream.close();
    }
}