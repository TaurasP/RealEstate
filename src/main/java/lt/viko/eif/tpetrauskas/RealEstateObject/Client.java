package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.Getter;

import java.io.*;
import java.net.Socket;

/**
 * Client is an entity used to send files to a Server entity.
 */
@Getter
public class Client{
    private DataOutputStream dataOutputStream = null;
    private DataInputStream dataInputStream = null;
    private String fileNameXML = "real-estate-object.xml";
    private int port = 3333;

    /**
     * Runs a client and sends a file to a server.
     */
    public void run() {
        try(Socket socket = new Socket("localhost", port)) {
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

            sendFile(fileNameXML);
            System.out.println("File " + "\""  + fileNameXML + "\"" + " sent from CLIENT via port " + port + ".");

            dataInputStream.close();
            dataInputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Sends a file to a server.
     *
     * @param path the path to a file
     */
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