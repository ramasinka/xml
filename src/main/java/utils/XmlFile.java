package utils;

import java.io.*;

public class XmlFile {
    public File createXmlFile(String path, String resourceType, String id, String versionId) {
        File file = new File(path + resourceType + id + versionId + ".xml");
        return file;
    }

    public void writeToXmlFile(String data, File file) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
            output.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}

